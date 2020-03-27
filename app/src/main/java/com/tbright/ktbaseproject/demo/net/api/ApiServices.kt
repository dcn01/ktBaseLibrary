package com.tbright.ktbaseproject.demo.net.api

import com.tbright.ktbaseproject.demo.bean.Dict
import com.tbright.ktbaseproject.demo.bean.Token
import com.tbright.ktbaseproject.demo.bean.User
import com.tbright.ktbaseproject.demo.net.response.BaseMagicResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.*

interface ApiServices {

    @FormUrlEncoded
    @POST("rest/auth/login/v1/app/")
    fun loginByPassword(
        @Field("loginName") loginName: String,
        @Field("password") password: String
    ): Deferred<BaseMagicResponse<Token>>

    //获取用户信息
    @GET("rest/main/magic/user/v1/")
    fun getUserInfo(@Query("userId") userId: String): Deferred<BaseMagicResponse<User>>

    @GET("rest/main/magic/common/v1/dict/")
    fun getDicList(): Deferred<BaseMagicResponse<List<Dict>?>>

}