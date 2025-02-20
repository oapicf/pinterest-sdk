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
package org.openapitools.server.models

import org.openapitools.server.models.CatalogsProductGroupFiltersRequest

/**
 * Request object for creating a product group.
 * @param name 
 * @param filters 
 * @param feedId Catalog Feed id pertaining to the catalog product group.
 * @param description 
 * @param isFeatured boolean indicator of whether the product group is being featured or not
 */
data class CatalogsProductGroupCreateRequest(
    val name: kotlin.String,
    val filters: CatalogsProductGroupFiltersRequest,
    /* Catalog Feed id pertaining to the catalog product group. */
    val feedId: kotlin.String,
    val description: kotlin.String? = null,
    /* boolean indicator of whether the product group is being featured or not */
    val isFeatured: kotlin.Boolean? = false
) 

