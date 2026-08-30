@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsHotelGuestRatings(
    @field:JsonProperty("max_score")
    val maxScore: java.math.BigDecimal? = null,

    @field:JsonProperty("number_of_reviewers")
    val numberOfReviewers: kotlin.Int? = null,

    @field:JsonProperty("rating_system")
    val ratingSystem: kotlin.String? = null,

    @field:JsonProperty("score")
    val score: java.math.BigDecimal? = null,

)
