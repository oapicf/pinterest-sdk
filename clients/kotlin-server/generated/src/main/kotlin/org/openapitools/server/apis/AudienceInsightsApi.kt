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
import org.openapitools.server.models.AudienceDefinitionResponse
import org.openapitools.server.models.AudienceInsightType
import org.openapitools.server.models.AudienceInsightsResponse
import org.openapitools.server.models.Error

fun Route.AudienceInsightsApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    authenticate("pinterest_oauth2") {
    get<Paths.audienceInsightsGet> {
        
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()!!
        
        
        val exampleContentType = "application/json"
            val exampleContentString = """{
              "date" : "2022-10-09",
              "size" : 10000,
              "categories" : [ {
                "name" : "travel",
                "index" : 1.2,
                "id" : "1234567",
                "subcategories" : [ {
                  "name" : "travel destinations",
                  "index" : 1.2,
                  "id" : "958862518888",
                  "key" : "958862518888",
                  "ratio" : 0.482
                }, {
                  "name" : "travel destinations",
                  "index" : 1.2,
                  "id" : "958862518888",
                  "key" : "958862518888",
                  "ratio" : 0.482
                } ],
                "key" : "1234567",
                "ratio" : 0.551
              }, {
                "name" : "travel",
                "index" : 1.2,
                "id" : "1234567",
                "subcategories" : [ {
                  "name" : "travel destinations",
                  "index" : 1.2,
                  "id" : "958862518888",
                  "key" : "958862518888",
                  "ratio" : 0.482
                }, {
                  "name" : "travel destinations",
                  "index" : 1.2,
                  "id" : "958862518888",
                  "key" : "958862518888",
                  "ratio" : 0.482
                } ],
                "key" : "1234567",
                "ratio" : 0.551
              } ],
              "type" : "YOUR_TOTAL_AUDIENCE",
              "size_is_upper_bound" : true,
              "demographics" : {
                "devices" : [ {
                  "name" : "United States",
                  "key" : "us",
                  "ratio" : 0.551
                }, {
                  "name" : "United States",
                  "key" : "us",
                  "ratio" : 0.551
                } ],
                "ages" : [ {
                  "name" : "United States",
                  "key" : "us",
                  "ratio" : 0.551
                }, {
                  "name" : "United States",
                  "key" : "us",
                  "ratio" : 0.551
                } ],
                "genders" : [ {
                  "name" : "United States",
                  "key" : "us",
                  "ratio" : 0.551
                }, {
                  "name" : "United States",
                  "key" : "us",
                  "ratio" : 0.551
                } ],
                "countries" : [ {
                  "name" : "United States",
                  "key" : "us",
                  "ratio" : 0.551
                }, {
                  "name" : "United States",
                  "key" : "us",
                  "ratio" : 0.551
                } ],
                "metros" : [ {
                  "name" : "United States",
                  "key" : "us",
                  "ratio" : 0.551
                }, {
                  "name" : "United States",
                  "key" : "us",
                  "ratio" : 0.551
                } ]
              }
            }"""
            
            when (exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        
    }
    }

    authenticate("pinterest_oauth2") {
    get<Paths.audienceInsightsScopeAndTypeGet> {
        
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()!!
        
        
        val exampleContentType = "application/json"
            val exampleContentString = """{
              "items" : [ {
                "date" : "2022-10-09",
                "scope" : "PARTNER",
                "type" : "IMPRESSION_PLUS_ENGAGEMENT"
              }, {
                "date" : "2022-10-09",
                "scope" : "PARTNER",
                "type" : "IMPRESSION_PLUS_ENGAGEMENT"
              } ]
            }"""
            
            when (exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        
    }
    }

}
