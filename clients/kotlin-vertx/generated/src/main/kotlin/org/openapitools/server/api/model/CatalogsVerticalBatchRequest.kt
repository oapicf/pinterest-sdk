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

import org.openapitools.server.api.model.CatalogsHotelBatchItem
import org.openapitools.server.api.model.CatalogsHotelBatchRequest
import org.openapitools.server.api.model.CatalogsRetailBatchRequest
import org.openapitools.server.api.model.CatalogsType
import org.openapitools.server.api.model.Country
import org.openapitools.server.api.model.Language

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * A request object that can have multiple operations on a single batch
 * @param catalogType 
 * @param country 
 * @param language 
 * @param items Array with catalogs item operations
 * @param catalogId Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class CatalogsVerticalBatchRequest (
    @SerializedName("catalogType") private val _catalogType: CatalogsType?,
    @SerializedName("country") private val _country: Country?,
    @SerializedName("language") private val _language: Language?,
    /* Array with catalogs item operations */
    @SerializedName("items") private val _items: kotlin.Array<CatalogsHotelBatchItem>?,
    /* Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog */
    val catalogId: kotlin.String? = null
) {

        val catalogType get() = _catalogType ?: throw IllegalArgumentException("catalogType is required")
                    
        val country get() = _country ?: throw IllegalArgumentException("country is required")
                    
        val language get() = _language ?: throw IllegalArgumentException("language is required")
                    
        val items get() = _items ?: throw IllegalArgumentException("items is required")
                    
}
