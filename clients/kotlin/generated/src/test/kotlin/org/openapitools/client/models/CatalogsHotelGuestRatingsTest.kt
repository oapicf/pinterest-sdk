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

import org.openapitools.client.models.CatalogsHotelGuestRatings

class CatalogsHotelGuestRatingsTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CatalogsHotelGuestRatings
        //val modelInstance = CatalogsHotelGuestRatings()

        // to test the property `score` - Your hotel's rating.
        should("test score") {
            // uncomment below to test the property
            //modelInstance.score shouldBe ("TODO")
        }

        // to test the property `numberOfReviewers` - Total number of people who have rated this hotel.
        should("test numberOfReviewers") {
            // uncomment below to test the property
            //modelInstance.numberOfReviewers shouldBe ("TODO")
        }

        // to test the property `maxScore` - Max value for the hotel rating score.
        should("test maxScore") {
            // uncomment below to test the property
            //modelInstance.maxScore shouldBe ("TODO")
        }

        // to test the property `ratingSystem` - System you use for guest reviews.
        should("test ratingSystem") {
            // uncomment below to test the property
            //modelInstance.ratingSystem shouldBe ("TODO")
        }

    }
}