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

import org.openapitools.server.api.model.InviteAssetsSummaryAdAccountsInner
import org.openapitools.server.api.model.InviteAssetsSummaryProfilesInner

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Ad accounts and profiles the member/partner will be granted access to with this invite/request.
 * @param adAccounts List of ad account IDs and respective permission levels that will be assigned.
 * @param profiles List of profile IDs and respective permission levels that will be assigned.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class InviteAssetsSummary (
    /* List of ad account IDs and respective permission levels that will be assigned. */
    val adAccounts: kotlin.Array<InviteAssetsSummaryAdAccountsInner>? = null,
    /* List of profile IDs and respective permission levels that will be assigned. */
    val profiles: kotlin.Array<InviteAssetsSummaryProfilesInner>? = null
) {

}

