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

import org.openapitools.server.api.model.CatalogsProductGroupMultipleStringCriteria

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param CUSTOM_LABEL_1 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class CustomLabel1Filter (
    @SerializedName("CUSTOM_LABEL_1") private val _CUSTOM_LABEL_1: CatalogsProductGroupMultipleStringCriteria?
) {

        val CUSTOM_LABEL_1 get() = _CUSTOM_LABEL_1 ?: throw IllegalArgumentException("CUSTOM_LABEL_1 is required")
                    
}

