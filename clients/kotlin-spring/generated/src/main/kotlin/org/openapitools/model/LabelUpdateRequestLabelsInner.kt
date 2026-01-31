package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.LabelStatus
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
 * @param id Label ID.
 * @param status 
 * @param &#x60;value&#x60; Label name. 100-character limit.
 */
data class LabelUpdateRequestLabelsInner(

    @Schema(example = "1106385754497", required = true, description = "Label ID.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: LabelStatus? = null,

    @get:Size(max=100)
    @Schema(example = "null", description = "Label name. 100-character limit.")
    @get:JsonProperty("value") val `value`: kotlin.String? = null
) {

}

