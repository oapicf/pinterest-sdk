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

import org.openapitools.server.api.model.CatalogsType
import org.openapitools.server.api.model.ItemValidationEvent

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Object describing a retail item error
 * @param catalogType 
 * @param itemId The catalog item id in the merchant namespace
 * @param errors Array with the errors for the item id requested
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class CatalogsRetailItemErrorResponse (
    @SerializedName("catalogType") private val _catalogType: CatalogsType?,
    /* The catalog item id in the merchant namespace */
    val itemId: kotlin.String? = null,
    /* Array with the errors for the item id requested */
    val errors: kotlin.Array<ItemValidationEvent>? = null
) {

        val catalogType get() = _catalogType ?: throw IllegalArgumentException("catalogType is required")
                    
}

