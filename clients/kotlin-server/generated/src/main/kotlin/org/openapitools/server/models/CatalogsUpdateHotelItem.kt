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

import org.openapitools.server.models.CatalogsUpdatableHotelAttributes

/**
 * Object describing an hotel item batch record
 * @param hotelId The catalog hotel item id in the merchant namespace
 * @param operation 
 * @param attributes 
 */
data class CatalogsUpdateHotelItem(
    /* The catalog hotel item id in the merchant namespace */
    val hotelId: kotlin.String,
    val operation: CatalogsUpdateHotelItem.Operation,
    val attributes: CatalogsUpdatableHotelAttributes
) 
{
    /**
    * 
    * Values: UPDATE
    */
    enum class Operation(val value: kotlin.String){
        UPDATE("UPDATE");
    }
}

