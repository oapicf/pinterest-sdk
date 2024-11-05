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
 * User website verification request
 * @param website 
 * @param verificationMethod 
 */
data class UserWebsiteVerifyRequest(

    @Schema(example = "pintest-website-12345678.test/test_1", description = "")
    @get:JsonProperty("website") val website: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("verification_method") val verificationMethod: UserWebsiteVerifyRequest.VerificationMethod? = VerificationMethod.METATAG
    ) {

    /**
    * 
    * Values: FILENAME,METATAG,DNSTXT
    */
    enum class VerificationMethod(@get:JsonValue val value: kotlin.String) {

        FILENAME("FILENAME"),
        METATAG("METATAG"),
        DNSTXT("DNSTXT");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): VerificationMethod {
                return values().first{it -> it.value == value}
            }
        }
    }

}

