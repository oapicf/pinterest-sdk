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

import org.openapitools.server.models.CatalogsProductGroupFiltersRequest
import org.openapitools.server.models.CatalogsProductGroupUpdateRequest
import org.openapitools.server.models.CatalogsVerticalProductGroupUpdateRequest

/**
 * 
 * @param name 
 * @param description 
 * @param isFeatured boolean indicator of whether the product group is being featured or not
 * @param filters 
 */
data class CatalogsProductGroupsUpdateRequest(
    val name: kotlin.String? = null,
    val description: kotlin.String? = null,
    /* boolean indicator of whether the product group is being featured or not */
    val isFeatured: kotlin.Boolean? = null,
    val filters: CatalogsProductGroupFiltersRequest? = null,
    val catalogType: CatalogsProductGroupsUpdateRequest.CatalogType? = null
) 
