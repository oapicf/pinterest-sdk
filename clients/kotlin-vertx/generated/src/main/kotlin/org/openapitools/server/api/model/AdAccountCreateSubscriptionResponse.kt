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
package org.openapitools.server.api.model


        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param id Subscription ID.
 * @param cryptographicKey Base64 encoded key for client to decrypt lead data.
 * @param cryptographicAlgorithm Lead data encryption algorithm.
 * @param createdTime Subscription creation time. Unix timestamp in milliseconds.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class AdAccountCreateSubscriptionResponse (
    /* Subscription ID. */
    val id: kotlin.String? = null,
    /* Base64 encoded key for client to decrypt lead data. */
    val cryptographicKey: kotlin.String? = null,
    /* Lead data encryption algorithm. */
    val cryptographicAlgorithm: kotlin.String? = null,
    /* Subscription creation time. Unix timestamp in milliseconds. */
    val createdTime: kotlin.Int? = null
) {

}
