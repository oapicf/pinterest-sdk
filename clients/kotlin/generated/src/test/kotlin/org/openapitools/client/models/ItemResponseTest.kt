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

import org.openapitools.client.models.ItemResponse
import org.openapitools.client.models.CatalogsCreativeAssetsAttributes
import org.openapitools.client.models.CatalogsType
import org.openapitools.client.models.ItemResponseAnyOf
import org.openapitools.client.models.ItemResponseAnyOf1
import org.openapitools.client.models.ItemValidationEvent
import org.openapitools.client.models.Pin

class ItemResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ItemResponse
        //val modelInstance = ItemResponse()

        // to test the property `catalogType`
        should("test catalogType") {
            // uncomment below to test the property
            //modelInstance.catalogType shouldBe ("TODO")
        }

        // to test the property `itemId` - The catalog item id in the merchant namespace
        should("test itemId") {
            // uncomment below to test the property
            //modelInstance.itemId shouldBe ("TODO")
        }

        // to test the property `errors` - Array with the errors for the item id requested
        should("test errors") {
            // uncomment below to test the property
            //modelInstance.errors shouldBe ("TODO")
        }

        // to test the property `hotelId` - The catalog hotel id in the merchant namespace
        should("test hotelId") {
            // uncomment below to test the property
            //modelInstance.hotelId shouldBe ("TODO")
        }

        // to test the property `creativeAssetsId` - The catalog creative assets id in the merchant namespace
        should("test creativeAssetsId") {
            // uncomment below to test the property
            //modelInstance.creativeAssetsId shouldBe ("TODO")
        }

    }
}
