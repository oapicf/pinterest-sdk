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

import org.openapitools.server.models.ItemAttributes

/**
 * Object describing an item batch record to upsert items
 * @param itemId The catalog item id in the merchant namespace
 * @param attributes 
 */
data class ItemUpsertBatchRecord(
    /* The catalog item id in the merchant namespace */
    val itemId: kotlin.String? = null,
    val attributes: ItemAttributes? = null
) 
