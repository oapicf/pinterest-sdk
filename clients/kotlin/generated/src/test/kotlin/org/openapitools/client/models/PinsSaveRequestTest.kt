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

import org.openapitools.client.models.PinsSaveRequest

class PinsSaveRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of PinsSaveRequest
        //val modelInstance = PinsSaveRequest()

        // to test the property `boardId` - Unique identifier of the board to which the pin will be saved.
        should("test boardId") {
            // uncomment below to test the property
            //modelInstance.boardId shouldBe ("TODO")
        }

        // to test the property `boardSectionId` - Unique identifier of the board section to which the pin will be saved.
        should("test boardSectionId") {
            // uncomment below to test the property
            //modelInstance.boardSectionId shouldBe ("TODO")
        }

    }
}