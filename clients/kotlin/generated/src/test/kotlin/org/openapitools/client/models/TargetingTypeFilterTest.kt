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

import org.openapitools.client.models.TargetingTypeFilter
import org.openapitools.client.models.AdsAnalyticsTargetingType

class TargetingTypeFilterTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of TargetingTypeFilter
        //val modelInstance = TargetingTypeFilter()

        // to test the property `targetingTypes` - List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
        should("test targetingTypes") {
            // uncomment below to test the property
            //modelInstance.targetingTypes shouldBe ("TODO")
        }

    }
}
