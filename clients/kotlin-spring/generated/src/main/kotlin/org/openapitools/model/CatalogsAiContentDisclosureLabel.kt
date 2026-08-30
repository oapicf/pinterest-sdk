package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
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
* Disclosure label for AI-generated or AI-modified content in a catalog item asset.
* Values: ai_modified,synthetic_performer
*/
enum class CatalogsAiContentDisclosureLabel(@get:JsonValue val value: kotlin.String) {

    ai_modified("ai_modified"),
    synthetic_performer("synthetic_performer");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): CatalogsAiContentDisclosureLabel {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CatalogsAiContentDisclosureLabel'")
        }
    }
}

