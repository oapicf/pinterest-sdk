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
package org.openapitools.server.models

import org.openapitools.server.models.CatalogsHotelProductGroupCreateRequest
import org.openapitools.server.models.CatalogsHotelProductGroupFilters

/**
 * Request object for creating a hotel product group.
 * @param catalogType 
 * @param name 
 * @param filters 
 * @param catalogId Catalog id pertaining to the hotel product group.
 * @param description 
 */
data class CatalogsVerticalProductGroupCreateRequest(
    val catalogType: CatalogsVerticalProductGroupCreateRequest.CatalogType,
    val name: kotlin.String,
    val filters: CatalogsHotelProductGroupFilters,
    /* Catalog id pertaining to the hotel product group. */
    val catalogId: kotlin.String,
    val description: kotlin.String? = null
) 
{
    /**
    * 
    * Values: HOTEL
    */
    enum class CatalogType(val value: kotlin.String){
        HOTEL("HOTEL");
    }
}
