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

import org.openapitools.client.models.CreateAssetAccessRequestResponse
import org.openapitools.client.models.CreateAssetAccessRequestErrorMessageInner

class CreateAssetAccessRequestResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CreateAssetAccessRequestResponse
        //val modelInstance = CreateAssetAccessRequestResponse()

        // to test the property `exceptions` - A list of errors associated with the asset access requests. Will be returned if there is an error.
        should("test exceptions") {
            // uncomment below to test the property
            //modelInstance.exceptions shouldBe ("TODO")
        }

        // to test the property `invites`
        should("test invites") {
            // uncomment below to test the property
            //modelInstance.invites shouldBe ("TODO")
        }

    }
}
