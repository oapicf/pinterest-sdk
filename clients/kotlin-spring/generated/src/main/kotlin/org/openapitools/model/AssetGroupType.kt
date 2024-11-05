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
* Asset group type
* Values: BRAND,LOCATION_OR_LANGUAGE,PRODUCT_LINE,OTHER
*/
enum class AssetGroupType(@get:JsonValue val value: kotlin.String) {

    BRAND("BRAND"),
    LOCATION_OR_LANGUAGE("LOCATION_OR_LANGUAGE"),
    PRODUCT_LINE("PRODUCT_LINE"),
    OTHER("OTHER");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): AssetGroupType {
                return values().first{it -> it.value == value}
        }
    }
}

