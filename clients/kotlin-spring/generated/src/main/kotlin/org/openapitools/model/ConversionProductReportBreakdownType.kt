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
* Values: PRODUCT_BRAND,PRODUCT_CATEGORY,PRODUCT_BRAND_AND_CATEGORY,PRODUCT_SKU,PRODUCT_SKU_GROUP
*/
enum class ConversionProductReportBreakdownType(@get:JsonValue val value: kotlin.String) {

    PRODUCT_BRAND("PRODUCT_BRAND"),
    PRODUCT_CATEGORY("PRODUCT_CATEGORY"),
    PRODUCT_BRAND_AND_CATEGORY("PRODUCT_BRAND_AND_CATEGORY"),
    PRODUCT_SKU("PRODUCT_SKU"),
    PRODUCT_SKU_GROUP("PRODUCT_SKU_GROUP");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ConversionProductReportBreakdownType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ConversionProductReportBreakdownType'")
        }
    }
}

