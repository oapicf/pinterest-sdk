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

import org.openapitools.client.models.CreateAssetGroupBody
import org.openapitools.client.models.AssetGroupType

class CreateAssetGroupBodyTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CreateAssetGroupBody
        //val modelInstance = CreateAssetGroupBody()

        // to test the property `assetGroupName` - Asset Group name
        should("test assetGroupName") {
            // uncomment below to test the property
            //modelInstance.assetGroupName shouldBe ("TODO")
        }

        // to test the property `assetGroupDescription` - Asset group description
        should("test assetGroupDescription") {
            // uncomment below to test the property
            //modelInstance.assetGroupDescription shouldBe ("TODO")
        }

        // to test the property `assetGroupTypes` - Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
        should("test assetGroupTypes") {
            // uncomment below to test the property
            //modelInstance.assetGroupTypes shouldBe ("TODO")
        }

    }
}
