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

import org.openapitools.server.api.model.MatchTypeResponse

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param matchType 
 * @param &#x60;value&#x60; Keyword value (120 chars max).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class AdGroupAudienceSizingRequestKeywordsInner (
    @SerializedName("matchType") private val _matchType: MatchTypeResponse?,
    /* Keyword value (120 chars max). */
    @SerializedName("`value`") private val _`value`: kotlin.String?
) {

        val matchType get() = _matchType ?: throw IllegalArgumentException("matchType is required")
                    
        val `value` get() = _`value` ?: throw IllegalArgumentException("`value` is required")
                    
}

