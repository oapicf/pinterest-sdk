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
* 
* Values: _90,_180,_365,_730
*/
enum class ProductCategoryDetailLookbackWindow(@get:JsonValue val value: java.math.BigDecimal) {

    _90("90"),
    _180("180"),
    _365("365"),
    _730("730");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: java.math.BigDecimal): ProductCategoryDetailLookbackWindow {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ProductCategoryDetailLookbackWindow'")
        }
    }
}

