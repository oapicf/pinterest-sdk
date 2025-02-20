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

import org.openapitools.server.api.model.CatalogsCreativeAssetsProductGroupFilters

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param catalogType 
 * @param id ID of the creative assets product group.
 * @param filters 
 * @param catalogId Catalog id pertaining to the creative assets product group.
 * @param name Name of creative assets product group
 * @param description 
 * @param createdAt Unix timestamp in seconds of when catalog product group was created.
 * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class CatalogsCreativeAssetsProductGroup (
    @SerializedName("catalogType") private val _catalogType: CatalogsCreativeAssetsProductGroup.CatalogType?,
    /* ID of the creative assets product group. */
    @SerializedName("id") private val _id: kotlin.String?,
    @SerializedName("filters") private val _filters: CatalogsCreativeAssetsProductGroupFilters?,
    /* Catalog id pertaining to the creative assets product group. */
    @SerializedName("catalogId") private val _catalogId: kotlin.String?,
    /* Name of creative assets product group */
    val name: kotlin.String? = null,
    val description: kotlin.String? = null,
    /* Unix timestamp in seconds of when catalog product group was created. */
    val createdAt: kotlin.Int? = null,
    /* Unix timestamp in seconds of last time catalog product group was updated. */
    val updatedAt: kotlin.Int? = null
) {

    /**
    * 
    * Values: CREATIVE_ASSETS
    */
    enum class CatalogType(val value: kotlin.String){
    
        CREATIVE_ASSETS("CREATIVE_ASSETS");
    
    }

        val catalogType get() = _catalogType ?: throw IllegalArgumentException("catalogType is required")
                    
        val id get() = _id ?: throw IllegalArgumentException("id is required")
                    
        val filters get() = _filters ?: throw IllegalArgumentException("filters is required")
                    
        val catalogId get() = _catalogId ?: throw IllegalArgumentException("catalogId is required")
                    
}

