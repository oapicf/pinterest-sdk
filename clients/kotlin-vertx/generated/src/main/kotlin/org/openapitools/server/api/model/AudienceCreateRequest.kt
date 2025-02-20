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

import org.openapitools.server.api.model.AudienceCreateRequest1AudienceType
import org.openapitools.server.api.model.AudienceRule

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param name Audience name.
 * @param rule 
 * @param audienceType 
 * @param adAccountId Ad account ID.
 * @param description Audience description.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class AudienceCreateRequest (
    /* Audience name. */
    @SerializedName("name") private val _name: kotlin.String?,
    @SerializedName("rule") private val _rule: AudienceRule?,
    @SerializedName("audienceType") private val _audienceType: AudienceCreateRequest1AudienceType?,
    /* Ad account ID. */
    val adAccountId: kotlin.String? = null,
    /* Audience description. */
    val description: kotlin.String? = null
) {

        val name get() = _name ?: throw IllegalArgumentException("name is required")
                    
        val rule get() = _rule ?: throw IllegalArgumentException("rule is required")
                    
        val audienceType get() = _audienceType ?: throw IllegalArgumentException("audienceType is required")
                    
}

