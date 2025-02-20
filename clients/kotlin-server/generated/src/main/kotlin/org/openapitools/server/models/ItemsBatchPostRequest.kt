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

import org.openapitools.server.models.BatchOperation
import org.openapitools.server.models.CatalogsItemsBatchRequest
import org.openapitools.server.models.CatalogsItemsRequestLanguage
import org.openapitools.server.models.CatalogsVerticalBatchRequest
import org.openapitools.server.models.Country
import org.openapitools.server.models.ItemDeleteBatchRecord

/**
 * 
 * @param country 
 * @param language 
 * @param operation 
 * @param items Array with catalogs items
 */
data class ItemsBatchPostRequest(
    val country: Country,
    val language: CatalogsItemsRequestLanguage,
    val operation: BatchOperation,
    /* Array with catalogs items */
    val items: kotlin.collections.List<ItemDeleteBatchRecord>,
    val catalogType: ItemsBatchPostRequest.CatalogType,
    /* Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog */
    val catalogId: kotlin.String? = null
) 

