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
* Level of the reporting request
* Values: ADVERTISER,ADVERTISER_TARGETING,CAMPAIGN,CAMPAIGN_TARGETING,AD_GROUP,AD_GROUP_TARGETING,PIN_PROMOTION,PIN_PROMOTION_TARGETING,KEYWORD,PRODUCT_GROUP,PRODUCT_GROUP_TARGETING,PRODUCT_ITEM
*/
enum class MetricsReportingLevel(val value: kotlin.String) {

    @JsonProperty("ADVERTISER") ADVERTISER("ADVERTISER"),
    @JsonProperty("ADVERTISER_TARGETING") ADVERTISER_TARGETING("ADVERTISER_TARGETING"),
    @JsonProperty("CAMPAIGN") CAMPAIGN("CAMPAIGN"),
    @JsonProperty("CAMPAIGN_TARGETING") CAMPAIGN_TARGETING("CAMPAIGN_TARGETING"),
    @JsonProperty("AD_GROUP") AD_GROUP("AD_GROUP"),
    @JsonProperty("AD_GROUP_TARGETING") AD_GROUP_TARGETING("AD_GROUP_TARGETING"),
    @JsonProperty("PIN_PROMOTION") PIN_PROMOTION("PIN_PROMOTION"),
    @JsonProperty("PIN_PROMOTION_TARGETING") PIN_PROMOTION_TARGETING("PIN_PROMOTION_TARGETING"),
    @JsonProperty("KEYWORD") KEYWORD("KEYWORD"),
    @JsonProperty("PRODUCT_GROUP") PRODUCT_GROUP("PRODUCT_GROUP"),
    @JsonProperty("PRODUCT_GROUP_TARGETING") PRODUCT_GROUP_TARGETING("PRODUCT_GROUP_TARGETING"),
    @JsonProperty("PRODUCT_ITEM") PRODUCT_ITEM("PRODUCT_ITEM")
}

