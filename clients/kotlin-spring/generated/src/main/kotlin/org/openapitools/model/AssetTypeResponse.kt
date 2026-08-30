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
* Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
* Values: AD_ACCOUNT,MERCHANT,PROFILE,ASSET_GROUP,PINNER_LIST,CONVERSION_TAG,CATALOG,CONVERSION_SEGMENT
*/
enum class AssetTypeResponse(@get:JsonValue val value: kotlin.String) {

    AD_ACCOUNT("AD_ACCOUNT"),
    MERCHANT("MERCHANT"),
    PROFILE("PROFILE"),
    ASSET_GROUP("ASSET_GROUP"),
    PINNER_LIST("PINNER_LIST"),
    CONVERSION_TAG("CONVERSION_TAG"),
    CATALOG("CATALOG"),
    CONVERSION_SEGMENT("CONVERSION_SEGMENT");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): AssetTypeResponse {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AssetTypeResponse'")
        }
    }
}

