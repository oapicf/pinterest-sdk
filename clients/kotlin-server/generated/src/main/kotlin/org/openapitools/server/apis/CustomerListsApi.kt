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
import org.openapitools.server.models.CustomerList
import org.openapitools.server.models.CustomerListRequest
import org.openapitools.server.models.CustomerListUpdateRequest
import org.openapitools.server.models.CustomerListsList200Response
import org.openapitools.server.models.Error

fun Route.CustomerListsApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    authenticate("pinterest_oauth2") {
    post<Paths.customerListsCreate> {
        
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()!!
        
        
        val exampleContentType = "application/json"
            val exampleContentString = """{
              "created_time" : 1452208622,
              "updated_time" : 1461269616,
              "name" : "The Glengarry Glen Ross leads",
              "num_removed_user_records" : 0,
              "id" : "643",
              "num_uploaded_user_records" : 11,
              "type" : "customerlist",
              "num_batches" : 2,
              "exceptions" : "{}",
              "ad_account_id" : "549756359984",
              "status" : "PROCESSING"
            }"""
            
            when (exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        
    }
    }

    authenticate("pinterest_oauth2") {
    get<Paths.customerListsGet> {
        
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()!!
        
        
        val exampleContentType = "application/json"
            val exampleContentString = """{
              "created_time" : 1452208622,
              "updated_time" : 1461269616,
              "name" : "The Glengarry Glen Ross leads",
              "num_removed_user_records" : 0,
              "id" : "643",
              "num_uploaded_user_records" : 11,
              "type" : "customerlist",
              "num_batches" : 2,
              "exceptions" : "{}",
              "ad_account_id" : "549756359984",
              "status" : "PROCESSING"
            }"""
            
            when (exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        
    }
    }

    authenticate("pinterest_oauth2") {
    get<Paths.customerListsList> {
        
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()!!
        
        
        val exampleContentType = "application/json"
            val exampleContentString = """{
              "bookmark" : "bookmark",
              "items" : [ {
                "created_time" : 1452208622,
                "updated_time" : 1461269616,
                "name" : "The Glengarry Glen Ross leads",
                "num_removed_user_records" : 0,
                "id" : "643",
                "num_uploaded_user_records" : 11,
                "type" : "customerlist",
                "num_batches" : 2,
                "exceptions" : "{}",
                "ad_account_id" : "549756359984",
                "status" : "PROCESSING"
              }, {
                "created_time" : 1452208622,
                "updated_time" : 1461269616,
                "name" : "The Glengarry Glen Ross leads",
                "num_removed_user_records" : 0,
                "id" : "643",
                "num_uploaded_user_records" : 11,
                "type" : "customerlist",
                "num_batches" : 2,
                "exceptions" : "{}",
                "ad_account_id" : "549756359984",
                "status" : "PROCESSING"
              } ]
            }"""
            
            when (exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        
    }
    }

    authenticate("pinterest_oauth2") {
    patch<Paths.customerListsUpdate> {
        
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()!!
        
        
        val exampleContentType = "application/json"
            val exampleContentString = """{
              "created_time" : 1452208622,
              "updated_time" : 1461269616,
              "name" : "The Glengarry Glen Ross leads",
              "num_removed_user_records" : 0,
              "id" : "643",
              "num_uploaded_user_records" : 11,
              "type" : "customerlist",
              "num_batches" : 2,
              "exceptions" : "{}",
              "ad_account_id" : "549756359984",
              "status" : "PROCESSING"
            }"""
            
            when (exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        
    }
    }

}
