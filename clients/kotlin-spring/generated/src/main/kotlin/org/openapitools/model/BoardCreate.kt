package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.BoardPrivacy
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
 * Resource create operation model.
 * @param name      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
 * @param description 
 * @param isAdsOnly If set to `true`, the board will be ad-only and can store ad-only Pins.
 * @param privacy     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`. 
 */
data class BoardCreate(

    @Schema(example = "Summer recipes", required = true, description = "     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "My favorite summer recipes", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "true", description = "If set to `true`, the board will be ad-only and can store ad-only Pins.")
    @get:JsonProperty("is_ads_only") val isAdsOnly: kotlin.Boolean? = false,

    @field:Valid
    @Schema(example = "null", description = "    Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`. ")
    @get:JsonProperty("privacy") val privacy: BoardPrivacy? = null
) {

}

