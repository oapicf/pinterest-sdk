package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param maxScore Max value for the hotel rating score.
 * @param numberOfReviewers Total number of people who have rated this hotel.
 * @param ratingSystem System you use for guest reviews.
 * @param score Your hotel's rating.
 */
data class CatalogsHotelGuestRatings(

    @Schema(description = "Max value for the hotel rating score.")
    @param:JsonProperty("max_score")
    @get:JsonProperty("max_score") val maxScore: java.math.BigDecimal? = null,

    @Schema(description = "Total number of people who have rated this hotel.")
    @param:JsonProperty("number_of_reviewers")
    @get:JsonProperty("number_of_reviewers") val numberOfReviewers: kotlin.Int? = null,

    @Schema(description = "System you use for guest reviews.")
    @param:JsonProperty("rating_system")
    @get:JsonProperty("rating_system") val ratingSystem: kotlin.String? = null,

    @Schema(description = "Your hotel's rating.")
    @param:JsonProperty("score")
    @get:JsonProperty("score") val score: java.math.BigDecimal? = null
) {

}

