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

import org.openapitools.client.models.KeywordUpdateBody
import org.openapitools.client.models.KeywordUpdate

class KeywordUpdateBodyTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of KeywordUpdateBody
        //val modelInstance = KeywordUpdateBody()

        // to test the property `keywords` - Keywords to update. Object array. Each object has 2 possible fields:<br>1. \"id\": (required) keyword ID<br>2. \"archived\": boolean. Should keyword be archived?<br>For example: [{\"id\":\"2886610576653\", \"archived\": false}, {\"id\":\"2886610576654\",  \"archived\": true}, ...]
        should("test keywords") {
            // uncomment below to test the property
            //modelInstance.keywords shouldBe ("TODO")
        }

    }
}
