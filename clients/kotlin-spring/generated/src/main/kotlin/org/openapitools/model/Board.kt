package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.BoardMedia
import org.openapitools.model.BoardOwner
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
 * Board
 * @param name 
 * @param id 
 * @param createdAt Date and time of board creation.
 * @param boardPinsModifiedAt Date and time of last board pins modified.
 * @param description 
 * @param collaboratorCount Count of collaborators on the board.
 * @param pinCount Count of pins on the board.
 * @param followerCount Board follower count.
 * @param media 
 * @param owner 
 * @param privacy Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
 */
data class Board(

    @Schema(example = "Summer Recipes", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "549755885175", readOnly = true, description = "")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "2020-01-01T20:10:40Z", readOnly = true, description = "Date and time of board creation.")
    @get:JsonProperty("created_at") val createdAt: java.time.OffsetDateTime? = null,

    @Schema(example = "2020-01-01T20:10:40Z", readOnly = true, description = "Date and time of last board pins modified.")
    @get:JsonProperty("board_pins_modified_at") val boardPinsModifiedAt: java.time.OffsetDateTime? = null,

    @Schema(example = "My favorite summer recipes", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @get:Min(0)
    @Schema(example = "17", readOnly = true, description = "Count of collaborators on the board.")
    @get:JsonProperty("collaborator_count") val collaboratorCount: kotlin.Int? = null,

    @get:Min(0)
    @Schema(example = "5", readOnly = true, description = "Count of pins on the board.")
    @get:JsonProperty("pin_count") val pinCount: kotlin.Int? = null,

    @get:Min(0)
    @Schema(example = "13", readOnly = true, description = "Board follower count.")
    @get:JsonProperty("follower_count") val followerCount: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("media") val media: BoardMedia? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: BoardOwner? = null,

    @Schema(example = "null", description = "Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>")
    @get:JsonProperty("privacy") val privacy: Board.Privacy? = Privacy.PUBLIC
) {

    /**
    * Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
    * Values: PUBLIC,PROTECTED,SECRET
    */
    enum class Privacy(val value: kotlin.String) {

        @JsonProperty("PUBLIC") PUBLIC("PUBLIC"),
        @JsonProperty("PROTECTED") PROTECTED("PROTECTED"),
        @JsonProperty("SECRET") SECRET("SECRET")
    }

}

