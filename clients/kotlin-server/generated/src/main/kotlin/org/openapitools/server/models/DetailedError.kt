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


/**
 * Used for including extra details to a base error
 * @param code 
 * @param message 
 * @param details 
 */
data class DetailedError(
    val code: kotlin.Int,
    val message: kotlin.String,
    val details: kotlin.Any
) 

