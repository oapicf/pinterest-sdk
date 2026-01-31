package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.BoardMedia
import org.openapitools.model.BoardOwner
import org.openapitools.model.BoardUpdatePrivacy
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
 * @param id 
 * @param name      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
 * @param boardPinsModifiedAt Date and time of last board pins modified.
 * @param collaboratorCount Count of collaborators on the board.
 * @param createdAt Date and time of board creation.
 * @param description 
 * @param followerCount Board follower count.
 * @param isAdsOnly If set to `true`, the board will be ad-only and can store ad-only Pins.
 * @param media Board media.
 * @param owner 
 * @param pinCount Count of Pins on the board.
 * @param privacy 
 */
data class BoardWithUpdatePrivacy(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "549755885175", required = true, readOnly = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "Summer recipes", required = true, description = "     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "null", readOnly = true, description = "Date and time of last board pins modified.")
    @get:JsonProperty("board_pins_modified_at") val boardPinsModifiedAt: java.time.OffsetDateTime? = null,

    @get:Min(value=0)
    @Schema(example = "17", readOnly = true, description = "Count of collaborators on the board.")
    @get:JsonProperty("collaborator_count") val collaboratorCount: kotlin.Int? = null,

    @Schema(example = "null", readOnly = true, description = "Date and time of board creation.")
    @get:JsonProperty("created_at") val createdAt: java.time.OffsetDateTime? = null,

    @Schema(example = "My favorite summer recipes", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @get:Min(value=0)
    @Schema(example = "13", readOnly = true, description = "Board follower count.")
    @get:JsonProperty("follower_count") val followerCount: kotlin.Int? = null,

    @Schema(example = "true", description = "If set to `true`, the board will be ad-only and can store ad-only Pins.")
    @get:JsonProperty("is_ads_only") val isAdsOnly: kotlin.Boolean? = false,

    @field:Valid
    @Schema(example = "null", readOnly = true, description = "Board media.")
    @get:JsonProperty("media") val media: BoardMedia? = null,

    @field:Valid
    @Schema(example = "null", readOnly = true, description = "")
    @get:JsonProperty("owner") val owner: BoardOwner? = null,

    @get:Min(value=0)
    @Schema(example = "5", readOnly = true, description = "Count of Pins on the board.")
    @get:JsonProperty("pin_count") val pinCount: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("privacy") val privacy: BoardUpdatePrivacy? = null
) {

}

