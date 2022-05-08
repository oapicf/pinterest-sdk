/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.3.0
* Contact: pinterest-api@pinterest.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models

import org.openapitools.server.models.CatalogsProductGroupFilters
import org.openapitools.server.models.CatalogsProductGroupStatus
import org.openapitools.server.models.CatalogsProductGroupType

/**
 * catalog product group entity
 * @param id ID of the catalog product group.
 * @param filters 
 * @param name Name of catalog product group
 * @param description 
 * @param type 
 * @param status 
 * @param feedId id of the catalogs feed belonging to this catalog product group
 * @param createdAt Unix timestamp in seconds of when catalog product group was created.
 * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated.
 */
data class CatalogsProductGroup(
    /* ID of the catalog product group. */
    val id: kotlin.String,
    val filters: CatalogsProductGroupFilters,
    /* Name of catalog product group */
    val name: kotlin.String? = null,
    val description: kotlin.String? = null,
    val type: CatalogsProductGroupType? = null,
    val status: CatalogsProductGroupStatus? = null,
    /* id of the catalogs feed belonging to this catalog product group */
    val feedId: kotlin.String? = null,
    /* Unix timestamp in seconds of when catalog product group was created. */
    val createdAt: kotlin.Int? = null,
    /* Unix timestamp in seconds of last time catalog product group was updated. */
    val updatedAt: kotlin.Int? = null
) 
