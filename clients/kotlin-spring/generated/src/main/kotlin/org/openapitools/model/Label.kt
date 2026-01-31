package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.LabelStatus
import org.openapitools.model.LabelType
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
 * @param parentId Label parent entity ID.
 * @param parentType Label parent entity type.
 * @param status 
 * @param &#x60;value&#x60; Label name.
 */
data class Label(

    @Schema(example = "1106385754497", description = "Label ID.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("label_type") val labelType: LabelType? = null,

    @Schema(example = "626753052072", description = "Label parent entity ID.")
    @get:JsonProperty("parent_id") val parentId: kotlin.String? = null,

    @Schema(example = "CAMPAIGN", description = "Label parent entity type.")
    @get:JsonProperty("parent_type") val parentType: Label.ParentType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: LabelStatus? = null,

    @get:Size(max=100)
    @Schema(example = "null", description = "Label name.")
    @get:JsonProperty("value") val `value`: kotlin.String? = null
) {

    /**
    * Label parent entity type.
    * Values: CAMPAIGN
    */
    enum class ParentType(@get:JsonValue val value: kotlin.String) {

        CAMPAIGN("CAMPAIGN");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ParentType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Label'")
            }
        }
    }

}

