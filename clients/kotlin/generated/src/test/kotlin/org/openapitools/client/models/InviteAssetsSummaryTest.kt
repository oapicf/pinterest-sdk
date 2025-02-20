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

package org.openapitools.client.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.models.InviteAssetsSummary
import org.openapitools.client.models.InviteAssetsSummaryAdAccountsInner
import org.openapitools.client.models.InviteAssetsSummaryProfilesInner

class InviteAssetsSummaryTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of InviteAssetsSummary
        //val modelInstance = InviteAssetsSummary()

        // to test the property `adAccounts` - List of ad account IDs and respective permission levels that will be assigned.
        should("test adAccounts") {
            // uncomment below to test the property
            //modelInstance.adAccounts shouldBe ("TODO")
        }

        // to test the property `profiles` - List of profile IDs and respective permission levels that will be assigned.
        should("test profiles") {
            // uncomment below to test the property
            //modelInstance.profiles shouldBe ("TODO")
        }

    }
}
