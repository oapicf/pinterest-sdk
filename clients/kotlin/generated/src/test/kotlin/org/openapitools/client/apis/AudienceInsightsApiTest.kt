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

import org.openapitools.client.apis.AudienceInsightsApi
import org.openapitools.client.models.AudienceDefinitionResponse
import org.openapitools.client.models.AudienceInsightType
import org.openapitools.client.models.AudienceInsightsResponse
import org.openapitools.client.models.Error

class AudienceInsightsApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of AudienceInsightsApi
        //val apiInstance = AudienceInsightsApi()

        // to test audienceInsightsGet
        should("test audienceInsightsGet") {
            // uncomment below to test audienceInsightsGet
            //val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
            //val audienceInsightType : AudienceInsightType =  // AudienceInsightType | Type of audience insights.
            //val result : AudienceInsightsResponse = apiInstance.audienceInsightsGet(adAccountId, audienceInsightType)
            //result shouldBe ("TODO")
        }

        // to test audienceInsightsScopeAndTypeGet
        should("test audienceInsightsScopeAndTypeGet") {
            // uncomment below to test audienceInsightsScopeAndTypeGet
            //val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
            //val result : AudienceDefinitionResponse = apiInstance.audienceInsightsScopeAndTypeGet(adAccountId)
            //result shouldBe ("TODO")
        }

    }
}