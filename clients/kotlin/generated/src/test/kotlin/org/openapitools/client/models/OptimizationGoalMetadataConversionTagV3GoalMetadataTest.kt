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

import org.openapitools.client.models.OptimizationGoalMetadataConversionTagV3GoalMetadata
import org.openapitools.client.models.OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows

class OptimizationGoalMetadataConversionTagV3GoalMetadataTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of OptimizationGoalMetadataConversionTagV3GoalMetadata
        //val modelInstance = OptimizationGoalMetadataConversionTagV3GoalMetadata()

        // to test the property `attributionWindows`
        should("test attributionWindows") {
            // uncomment below to test the property
            //modelInstance.attributionWindows shouldBe ("TODO")
        }

        // to test the property `conversionEvent`
        should("test conversionEvent") {
            // uncomment below to test the property
            //modelInstance.conversionEvent shouldBe ("TODO")
        }

        // to test the property `conversionTagId`
        should("test conversionTagId") {
            // uncomment below to test the property
            //modelInstance.conversionTagId shouldBe ("TODO")
        }

        // to test the property `cpaGoalValueInMicroCurrency`
        should("test cpaGoalValueInMicroCurrency") {
            // uncomment below to test the property
            //modelInstance.cpaGoalValueInMicroCurrency shouldBe ("TODO")
        }

        // to test the property `isRoasOptimized` - ROAS optimization is not supported
        should("test isRoasOptimized") {
            // uncomment below to test the property
            //modelInstance.isRoasOptimized shouldBe ("TODO")
        }

        // to test the property `learningModeType` - Conversion learning model type
        should("test learningModeType") {
            // uncomment below to test the property
            //modelInstance.learningModeType shouldBe ("TODO")
        }

    }
}
