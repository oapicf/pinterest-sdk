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
package org.openapitools.server.api.model


        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param website Website with path or domain only
 * @param status Status of the verification process
 * @param verifiedAt UTC timestamp when the verification happened - sometimes missing
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class UserWebsiteSummary (
    /* Website with path or domain only */
    val website: kotlin.String? = null,
    /* Status of the verification process */
    val status: kotlin.String? = null,
    /* UTC timestamp when the verification happened - sometimes missing */
    val verifiedAt: kotlin.String? = null
) {

}

