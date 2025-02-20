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

import org.openapitools.client.models.TargetingSpec
import org.openapitools.client.models.TargetingSpecSHOPPINGRETARGETING

class TargetingSpecTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of TargetingSpec
        //val modelInstance = TargetingSpec()

        // to test the property `AGE_BUCKET` - Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.
        should("test AGE_BUCKET") {
            // uncomment below to test the property
            //modelInstance.AGE_BUCKET shouldBe ("TODO")
        }

        // to test the property `APPTYPE` - Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
        should("test APPTYPE") {
            // uncomment below to test the property
            //modelInstance.APPTYPE shouldBe ("TODO")
        }

        // to test the property `AUDIENCE_EXCLUDE` - Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
        should("test AUDIENCE_EXCLUDE") {
            // uncomment below to test the property
            //modelInstance.AUDIENCE_EXCLUDE shouldBe ("TODO")
        }

        // to test the property `AUDIENCE_INCLUDE` - Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
        should("test AUDIENCE_INCLUDE") {
            // uncomment below to test the property
            //modelInstance.AUDIENCE_INCLUDE shouldBe ("TODO")
        }

        // to test the property `GENDER` - Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
        should("test GENDER") {
            // uncomment below to test the property
            //modelInstance.GENDER shouldBe ("TODO")
        }

        // to test the property `GEO` - Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. At least one of LOCATION or GEO must be specified. If the GEO field is missing, then only LOCATION values will be targeted (see LOCATION field below).
        should("test GEO") {
            // uncomment below to test the property
            //modelInstance.GEO shouldBe ("TODO")
        }

        // to test the property `INTEREST` - Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
        should("test INTEREST") {
            // uncomment below to test the property
            //modelInstance.INTEREST shouldBe ("TODO")
        }

        // to test the property `LOCALE` - 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be targeted, only english non-sublanguage will be targeted**.
        should("test LOCALE") {
            // uncomment below to test the property
            //modelInstance.LOCALE shouldBe ("TODO")
        }

        // to test the property `LOCATION` - 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply. At least one of LOCATION or GEO must be specified. If the LOCATION field is missing, then only GEO values will be targeted (see GEO field above).
        should("test LOCATION") {
            // uncomment below to test the property
            //modelInstance.LOCATION shouldBe ("TODO")
        }

        // to test the property `SHOPPING_RETARGETING` - Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
        should("test SHOPPING_RETARGETING") {
            // uncomment below to test the property
            //modelInstance.SHOPPING_RETARGETING shouldBe ("TODO")
        }

        // to test the property `TARGETING_STRATEGY` - 
        should("test TARGETING_STRATEGY") {
            // uncomment below to test the property
            //modelInstance.TARGETING_STRATEGY shouldBe ("TODO")
        }

    }
}
