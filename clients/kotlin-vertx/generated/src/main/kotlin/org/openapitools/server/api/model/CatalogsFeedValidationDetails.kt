/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.12.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsFeedValidationErrors
import org.openapitools.server.api.model.CatalogsFeedValidationWarnings

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param errors 
 * @param warnings 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class CatalogsFeedValidationDetails (
    @SerializedName("errors") private val _errors: CatalogsFeedValidationErrors?,
    @SerializedName("warnings") private val _warnings: CatalogsFeedValidationWarnings?
) {

        val errors get() = _errors ?: throw IllegalArgumentException("errors is required")
                    
        val warnings get() = _warnings ?: throw IllegalArgumentException("warnings is required")
                    
}
