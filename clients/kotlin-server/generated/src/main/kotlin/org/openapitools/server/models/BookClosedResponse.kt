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


/**
 * Creation fields
 * @param conversionMetricsReady Are conversion metrics ready?
 * @param nonConversionMetricsReady Are non-conversion metrics ready?
 */
data class BookClosedResponse(
    /* Are conversion metrics ready? */
    val conversionMetricsReady: kotlin.Boolean? = null,
    /* Are non-conversion metrics ready? */
    val nonConversionMetricsReady: kotlin.Boolean? = null
) 
