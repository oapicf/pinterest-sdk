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
 * @param offerCodeHash Takes in a SHA256 hash of the offerCode.
 * @param validateOnly If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class AdsCreditRedeemRequest (
    /* Takes in a SHA256 hash of the offerCode. */
    @SerializedName("offerCodeHash") private val _offerCodeHash: kotlin.String?,
    /* If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account */
    @SerializedName("validateOnly") private val _validateOnly: kotlin.Boolean?
) {

        val offerCodeHash get() = _offerCodeHash ?: throw IllegalArgumentException("offerCodeHash is required")
                    
        val validateOnly get() = _validateOnly ?: throw IllegalArgumentException("validateOnly is required")
                    
}
