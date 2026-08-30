package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
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
 * @param name     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
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
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "Summer recipes", required = true, description = "    Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(readOnly = true, description = "Date and time of last board pins modified.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("board_pins_modified_at")
    @get:JsonProperty("board_pins_modified_at") val boardPinsModifiedAt: java.time.OffsetDateTime? = null,

    @get:Min(value=0)
    @Schema(example = "17", readOnly = true, description = "Count of collaborators on the board.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("collaborator_count")
    @get:JsonProperty("collaborator_count") val collaboratorCount: kotlin.Int? = null,

    @Schema(readOnly = true, description = "Date and time of board creation.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("created_at")
    @get:JsonProperty("created_at") val createdAt: java.time.OffsetDateTime? = null,

    @Schema(example = "My favorite summer recipes", description = "")
    @param:JsonProperty("description")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @get:Min(value=0)
    @Schema(example = "13", readOnly = true, description = "Board follower count.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("follower_count")
    @get:JsonProperty("follower_count") val followerCount: kotlin.Int? = null,

    @Schema(example = "true", description = "If set to `true`, the board will be ad-only and can store ad-only Pins.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_ads_only")
    @get:JsonProperty("is_ads_only") val isAdsOnly: kotlin.Boolean? = false,

    @field:Valid
    @Schema(readOnly = true, description = "Board media.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("media")
    @get:JsonProperty("media") val media: BoardMedia? = null,

    @field:Valid
    @Schema(readOnly = true, description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("owner")
    @get:JsonProperty("owner") val owner: BoardOwner? = null,

    @get:Min(value=0)
    @Schema(example = "5", readOnly = true, description = "Count of Pins on the board.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("pin_count")
    @get:JsonProperty("pin_count") val pinCount: kotlin.Int? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("privacy")
    @get:JsonProperty("privacy") val privacy: BoardUpdatePrivacy? = null
) {

}

