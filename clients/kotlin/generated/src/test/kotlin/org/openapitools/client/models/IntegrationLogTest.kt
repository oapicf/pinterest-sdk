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

import org.openapitools.client.models.IntegrationLog
import org.openapitools.client.models.IntegrationLogClientError
import org.openapitools.client.models.IntegrationLogClientRequest

class IntegrationLogTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of IntegrationLog
        //val modelInstance = IntegrationLog()

        // to test the property `clientTimestamp` - Timestamp in milliseconds of when the log was executed at the client.
        should("test clientTimestamp") {
            // uncomment below to test the property
            //modelInstance.clientTimestamp shouldBe ("TODO")
        }

        // to test the property `eventType` - Log event type
        should("test eventType") {
            // uncomment below to test the property
            //modelInstance.eventType shouldBe ("TODO")
        }

        // to test the property `logLevel` - Log level type
        should("test logLevel") {
            // uncomment below to test the property
            //modelInstance.logLevel shouldBe ("TODO")
        }

        // to test the property `externalBusinessId`
        should("test externalBusinessId") {
            // uncomment below to test the property
            //modelInstance.externalBusinessId shouldBe ("TODO")
        }

        // to test the property `advertiserId`
        should("test advertiserId") {
            // uncomment below to test the property
            //modelInstance.advertiserId shouldBe ("TODO")
        }

        // to test the property `merchantId`
        should("test merchantId") {
            // uncomment below to test the property
            //modelInstance.merchantId shouldBe ("TODO")
        }

        // to test the property `tagId`
        should("test tagId") {
            // uncomment below to test the property
            //modelInstance.tagId shouldBe ("TODO")
        }

        // to test the property `feedProfileId`
        should("test feedProfileId") {
            // uncomment below to test the property
            //modelInstance.feedProfileId shouldBe ("TODO")
        }

        // to test the property `message` - Explanation of the event that occured.
        should("test message") {
            // uncomment below to test the property
            //modelInstance.message shouldBe ("TODO")
        }

        // to test the property `appVersionNumber` - Version number of the integration application.
        should("test appVersionNumber") {
            // uncomment below to test the property
            //modelInstance.appVersionNumber shouldBe ("TODO")
        }

        // to test the property `platformVersionNumber` - Version number of the platform the integration application is running on.
        should("test platformVersionNumber") {
            // uncomment below to test the property
            //modelInstance.platformVersionNumber shouldBe ("TODO")
        }

        // to test the property `error`
        should("test error") {
            // uncomment below to test the property
            //modelInstance.error shouldBe ("TODO")
        }

        // to test the property `request`
        should("test request") {
            // uncomment below to test the property
            //modelInstance.request shouldBe ("TODO")
        }

    }
}