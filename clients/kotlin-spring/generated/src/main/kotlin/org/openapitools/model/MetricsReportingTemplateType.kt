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
* Reporting template type
* Values: UNSPECIFIED,BULK,OVERVIEW,TABLE,MMM,BRAND_CATEGORY
*/
enum class MetricsReportingTemplateType(@get:JsonValue val value: kotlin.String) {

    UNSPECIFIED("UNSPECIFIED"),
    BULK("BULK"),
    OVERVIEW("OVERVIEW"),
    TABLE("TABLE"),
    MMM("MMM"),
    BRAND_CATEGORY("BRAND_CATEGORY");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): MetricsReportingTemplateType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'MetricsReportingTemplateType'")
        }
    }
}

