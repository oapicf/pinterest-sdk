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
* Ad creative type enum. For update, only draft ads may update creative type. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
* Values: REGULAR,VIDEO,SHOPPING,CAROUSEL,MAX_VIDEO,SHOP_THE_PIN,COLLECTION,IDEA,SHOWCASE,QUIZ
*/
enum class CreativeType(val value: kotlin.String) {

    @JsonProperty("REGULAR") REGULAR("REGULAR"),
    @JsonProperty("VIDEO") VIDEO("VIDEO"),
    @JsonProperty("SHOPPING") SHOPPING("SHOPPING"),
    @JsonProperty("CAROUSEL") CAROUSEL("CAROUSEL"),
    @JsonProperty("MAX_VIDEO") MAX_VIDEO("MAX_VIDEO"),
    @JsonProperty("SHOP_THE_PIN") SHOP_THE_PIN("SHOP_THE_PIN"),
    @JsonProperty("COLLECTION") COLLECTION("COLLECTION"),
    @JsonProperty("IDEA") IDEA("IDEA"),
    @JsonProperty("SHOWCASE") SHOWCASE("SHOWCASE"),
    @JsonProperty("QUIZ") QUIZ("QUIZ")
}

