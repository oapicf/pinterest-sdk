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
 * 
 * @param code Error code associated with the error editing asset group.
 * @param message Error message associated with the error editing asset group.
 * @param assetGroupId Asset group id of the exception.
 */
data class UpdateAssetGroupResponseExceptionsInner(
    /* Error code associated with the error editing asset group. */
    val code: kotlin.Int? = null,
    /* Error message associated with the error editing asset group. */
    val message: kotlin.String? = null,
    /* Asset group id of the exception. */
    val assetGroupId: kotlin.String? = null
) 

