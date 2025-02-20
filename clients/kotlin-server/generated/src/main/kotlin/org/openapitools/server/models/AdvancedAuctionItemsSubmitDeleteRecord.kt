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

import org.openapitools.server.models.Country
import org.openapitools.server.models.Language

/**
 * Object describing an item bid option deletion operation
 * @param itemId The catalog retail item id in the merchant namespace
 * @param country 
 * @param language 
 */
data class AdvancedAuctionItemsSubmitDeleteRecord(
    /* The catalog retail item id in the merchant namespace */
    val itemId: kotlin.String,
    val country: Country,
    val language: Language
) 

