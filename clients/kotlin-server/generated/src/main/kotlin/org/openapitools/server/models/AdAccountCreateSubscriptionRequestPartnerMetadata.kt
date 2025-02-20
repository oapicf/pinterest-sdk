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
 * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
 * @param subscriberKey Text field value that uniquely identifies a subscriber.
 */
data class AdAccountCreateSubscriptionRequestPartnerMetadata(
    /* Text field value that uniquely identifies a subscriber. */
    val subscriberKey: kotlin.String? = null
) 

