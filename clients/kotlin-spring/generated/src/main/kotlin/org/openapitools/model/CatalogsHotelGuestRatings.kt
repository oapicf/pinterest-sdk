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
 * If specified, you must provide all properties
 * @param score Your hotel's rating.
 * @param numberOfReviewers Total number of people who have rated this hotel.
 * @param maxScore Max value for the hotel rating score.
 * @param ratingSystem System you use for guest reviews.
 */
data class CatalogsHotelGuestRatings(

    @Schema(example = "null", description = "Your hotel's rating.")
    @get:JsonProperty("score") val score: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Total number of people who have rated this hotel.")
    @get:JsonProperty("number_of_reviewers") val numberOfReviewers: kotlin.Int? = null,

    @Schema(example = "null", description = "Max value for the hotel rating score.")
    @get:JsonProperty("max_score") val maxScore: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "System you use for guest reviews.")
    @get:JsonProperty("rating_system") val ratingSystem: kotlin.String? = null
) {

}

