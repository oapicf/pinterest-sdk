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

import org.openapitools.client.models.CatalogsFeedIngestionInfo

class CatalogsFeedIngestionInfoTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CatalogsFeedIngestionInfo
        //val modelInstance = CatalogsFeedIngestionInfo()

        // to test the property `IN_STOCK` - The number of ingested products that are in stock.
        should("test IN_STOCK") {
            // uncomment below to test the property
            //modelInstance.IN_STOCK shouldBe ("TODO")
        }

        // to test the property `OUT_OF_STOCK` - The number of ingested products that are in out of stock.
        should("test OUT_OF_STOCK") {
            // uncomment below to test the property
            //modelInstance.OUT_OF_STOCK shouldBe ("TODO")
        }

        // to test the property `PREORDER` - The number of ingested products that are in preorder.
        should("test PREORDER") {
            // uncomment below to test the property
            //modelInstance.PREORDER shouldBe ("TODO")
        }

    }
}