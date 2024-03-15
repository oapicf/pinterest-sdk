package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
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
* Refers ads entity type
* Values: CAMPAIGN,AD_GROUP,PRODUCT_GROUP,AD,KEYWORD
*/
enum class BulkEntityType(val value: kotlin.String) {

    @JsonProperty("CAMPAIGN") CAMPAIGN("CAMPAIGN"),
    @JsonProperty("AD_GROUP") AD_GROUP("AD_GROUP"),
    @JsonProperty("PRODUCT_GROUP") PRODUCT_GROUP("PRODUCT_GROUP"),
    @JsonProperty("AD") AD("AD"),
    @JsonProperty("KEYWORD") KEYWORD("KEYWORD")
}

