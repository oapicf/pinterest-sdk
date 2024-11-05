package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
 * @param sourceType 
 * @param isAffiliateLink This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
 */
data class PinMediaSourcePinURL(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("source_type", required = true) val sourceType: PinMediaSourcePinURL.SourceType,

    @Schema(example = "null", description = "This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.")
    @get:JsonProperty("is_affiliate_link") val isAffiliateLink: kotlin.Boolean? = false
    ) {

    /**
    * 
    * Values: pin_url
    */
    enum class SourceType(@get:JsonValue val value: kotlin.String) {

        pin_url("pin_url");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): SourceType {
                return values().first{it -> it.value == value}
            }
        }
    }

}

