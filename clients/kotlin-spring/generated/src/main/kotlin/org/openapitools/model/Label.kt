package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.NullableLabelStatus
import org.openapitools.model.NullableLabelType
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
 * @param labelType 
 * @param &#x60;value&#x60; Label name. 100-character limit.
 * @param status 
 */
data class Label(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "1106385754497", required = true, description = "Label ID.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("label_type")
    @get:JsonProperty("label_type", required = true) val labelType: NullableLabelType?,

    @get:Size(max=100)
    @Schema(required = true, description = "Label name. 100-character limit.")
    @param:JsonProperty("value")
    @get:JsonProperty("value", required = true) val `value`: kotlin.String,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: NullableLabelStatus? = null
) {

}

