/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.apis

import com.google.gson.Gson
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*
import org.openapitools.server.Paths
import io.ktor.server.resources.options
import io.ktor.server.resources.get
import io.ktor.server.resources.post
import io.ktor.server.resources.put
import io.ktor.server.resources.delete
import io.ktor.server.resources.head
import io.ktor.server.resources.patch
import io.ktor.server.routing.*
import org.openapitools.server.infrastructure.ApiPrincipal
import org.openapitools.server.models.Error
import org.openapitools.server.models.OauthAccessTokenResponse

fun Route.OauthApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    authenticate("basic") {
    post<Paths.oauthToken> {
        val principal = call.authentication.principal<UserIdPrincipal>()!!
        
        
        val exampleContentType = "application/json"
            val exampleContentString = """{
              "access_token" : "access_token",
              "scope" : "scope",
              "response_type" : "authorization_code",
              "token_type" : "bearer",
              "expires_in" : 0
            }"""
            
            when (exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        
    }
    }

}
