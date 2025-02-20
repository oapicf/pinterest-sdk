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
package org.openapitools.server.api.model


        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * This field is **OPTIONAL**. Use this if your feed file requires username and password.
 * @param password The required password for downloading a feed.
 * @param username The required username for downloading a feed.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class CatalogsFeedCredentials (
    /* The required password for downloading a feed. */
    @SerializedName("password") private val _password: kotlin.String?,
    /* The required username for downloading a feed. */
    @SerializedName("username") private val _username: kotlin.String?
) {

        val password get() = _password ?: throw IllegalArgumentException("password is required")
                    
        val username get() = _username ?: throw IllegalArgumentException("username is required")
                    
}

