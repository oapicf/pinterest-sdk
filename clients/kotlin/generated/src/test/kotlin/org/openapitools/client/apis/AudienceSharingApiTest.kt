/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.apis.AudienceSharingApi
import org.openapitools.client.models.AdAccountsAudiencesSharedAccountsList200Response
import org.openapitools.client.models.AudienceAccountType
import org.openapitools.client.models.AudiencesList200Response
import org.openapitools.client.models.BusinessSharedAudience
import org.openapitools.client.models.BusinessSharedAudienceResponse
import org.openapitools.client.models.Error
import org.openapitools.client.models.SharedAudience
import org.openapitools.client.models.SharedAudienceResponse

class AudienceSharingApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of AudienceSharingApi
        //val apiInstance = AudienceSharingApi()

        // to test adAccountsAudiencesSharedAccountsList
        should("test adAccountsAudiencesSharedAccountsList") {
            // uncomment below to test adAccountsAudiencesSharedAccountsList
            //val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
            //val audienceId : kotlin.String = audienceId_example // kotlin.String | Unique identifier of the audience to use to filter the results.
            //val accountType : AudienceAccountType =  // AudienceAccountType | Filter accounts by account type.
            //val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
            //val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
            //val result : AdAccountsAudiencesSharedAccountsList200Response = apiInstance.adAccountsAudiencesSharedAccountsList(adAccountId, audienceId, accountType, pageSize, bookmark)
            //result shouldBe ("TODO")
        }

        // to test businessAccountAudiencesSharedAccountsList
        should("test businessAccountAudiencesSharedAccountsList") {
            // uncomment below to test businessAccountAudiencesSharedAccountsList
            //val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
            //val audienceId : kotlin.String = audienceId_example // kotlin.String | Unique identifier of the audience to use to filter the results.
            //val accountType : AudienceAccountType =  // AudienceAccountType | Filter accounts by account type.
            //val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
            //val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
            //val result : AdAccountsAudiencesSharedAccountsList200Response = apiInstance.businessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, pageSize, bookmark)
            //result shouldBe ("TODO")
        }

        // to test sharedAudiencesForBusinessList
        should("test sharedAudiencesForBusinessList") {
            // uncomment below to test sharedAudiencesForBusinessList
            //val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
            //val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
            //val order : kotlin.String = ASCENDING // kotlin.String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
            //val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
            //val result : AudiencesList200Response = apiInstance.sharedAudiencesForBusinessList(businessId, bookmark, order, pageSize)
            //result shouldBe ("TODO")
        }

        // to test updateAdAccountToAdAccountSharedAudience
        should("test updateAdAccountToAdAccountSharedAudience") {
            // uncomment below to test updateAdAccountToAdAccountSharedAudience
            //val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
            //val sharedAudience : SharedAudience =  // SharedAudience | 
            //val result : SharedAudienceResponse = apiInstance.updateAdAccountToAdAccountSharedAudience(adAccountId, sharedAudience)
            //result shouldBe ("TODO")
        }

        // to test updateAdAccountToBusinessSharedAudience
        should("test updateAdAccountToBusinessSharedAudience") {
            // uncomment below to test updateAdAccountToBusinessSharedAudience
            //val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
            //val businessSharedAudience : BusinessSharedAudience =  // BusinessSharedAudience | 
            //val result : BusinessSharedAudienceResponse = apiInstance.updateAdAccountToBusinessSharedAudience(adAccountId, businessSharedAudience)
            //result shouldBe ("TODO")
        }

        // to test updateBusinessToAdAccountSharedAudience
        should("test updateBusinessToAdAccountSharedAudience") {
            // uncomment below to test updateBusinessToAdAccountSharedAudience
            //val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
            //val sharedAudience : SharedAudience =  // SharedAudience | 
            //val result : SharedAudienceResponse = apiInstance.updateBusinessToAdAccountSharedAudience(businessId, sharedAudience)
            //result shouldBe ("TODO")
        }

        // to test updateBusinessToBusinessSharedAudience
        should("test updateBusinessToBusinessSharedAudience") {
            // uncomment below to test updateBusinessToBusinessSharedAudience
            //val businessId : kotlin.String = 729090764583391194 // kotlin.String | Unique identifier of the requesting business.
            //val businessSharedAudience : BusinessSharedAudience =  // BusinessSharedAudience | 
            //val result : BusinessSharedAudienceResponse = apiInstance.updateBusinessToBusinessSharedAudience(businessId, businessSharedAudience)
            //result shouldBe ("TODO")
        }

    }
}
