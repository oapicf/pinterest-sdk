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
 * 
 * @param code Exception error code.
 * @param message Exception message.
 */
data class Exception(
    /* Exception error code. */
    val code: kotlin.Int? = null,
    /* Exception message. */
    val message: kotlin.String? = null
) 
