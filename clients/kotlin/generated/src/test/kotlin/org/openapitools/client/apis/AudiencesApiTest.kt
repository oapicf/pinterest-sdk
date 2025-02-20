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

import org.openapitools.client.apis.AudiencesApi
import org.openapitools.client.models.Audience
import org.openapitools.client.models.AudienceCreateCustomRequest
import org.openapitools.client.models.AudienceCreateRequest
import org.openapitools.client.models.AudienceUpdateRequest
import org.openapitools.client.models.AudiencesList200Response
import org.openapitools.client.models.Error

class AudiencesApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of AudiencesApi
        //val apiInstance = AudiencesApi()

        // to test audiencesCreate
        should("test audiencesCreate") {
            // uncomment below to test audiencesCreate
            //val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
            //val audienceCreateRequest : AudienceCreateRequest =  // AudienceCreateRequest | List of ads to create, size limit [1, 30]
            //val result : Audience = apiInstance.audiencesCreate(adAccountId, audienceCreateRequest)
            //result shouldBe ("TODO")
        }

        // to test audiencesCreateCustom
        should("test audiencesCreateCustom") {
            // uncomment below to test audiencesCreateCustom
            //val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
            //val audienceCreateCustomRequest : AudienceCreateCustomRequest =  // AudienceCreateCustomRequest | Custom audience to create.
            //val result : Audience = apiInstance.audiencesCreateCustom(adAccountId, audienceCreateCustomRequest)
            //result shouldBe ("TODO")
        }

        // to test audiencesGet
        should("test audiencesGet") {
            // uncomment below to test audiencesGet
            //val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
            //val audienceId : kotlin.String = audienceId_example // kotlin.String | Unique identifier of an audience
            //val result : Audience = apiInstance.audiencesGet(adAccountId, audienceId)
            //result shouldBe ("TODO")
        }

        // to test audiencesList
        should("test audiencesList") {
            // uncomment below to test audiencesList
            //val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
            //val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
            //val order : kotlin.String = ASCENDING // kotlin.String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.
            //val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
            //val ownershipType : kotlin.String = OWNED // kotlin.String | Filter audiences by ownership type.
            //val result : AudiencesList200Response = apiInstance.audiencesList(adAccountId, bookmark, order, pageSize, ownershipType)
            //result shouldBe ("TODO")
        }

        // to test audiencesUpdate
        should("test audiencesUpdate") {
            // uncomment below to test audiencesUpdate
            //val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
            //val audienceId : kotlin.String = audienceId_example // kotlin.String | Unique identifier of an audience
            //val audienceUpdateRequest : AudienceUpdateRequest =  // AudienceUpdateRequest | The audience to be updated.
            //val result : Audience = apiInstance.audiencesUpdate(adAccountId, audienceId, audienceUpdateRequest)
            //result shouldBe ("TODO")
        }

    }
}
