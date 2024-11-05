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
* Level of the reporting request
* Values: ADVERTISER,ADVERTISER_TARGETING,CAMPAIGN,CAMPAIGN_TARGETING,AD_GROUP,AD_GROUP_TARGETING,PIN_PROMOTION,PIN_PROMOTION_TARGETING,KEYWORD,PRODUCT_GROUP,PRODUCT_GROUP_TARGETING,PRODUCT_ITEM,PRODUCT_ITEM_TARGETING
*/
enum class MetricsReportingLevel(@get:JsonValue val value: kotlin.String) {

    ADVERTISER("ADVERTISER"),
    ADVERTISER_TARGETING("ADVERTISER_TARGETING"),
    CAMPAIGN("CAMPAIGN"),
    CAMPAIGN_TARGETING("CAMPAIGN_TARGETING"),
    AD_GROUP("AD_GROUP"),
    AD_GROUP_TARGETING("AD_GROUP_TARGETING"),
    PIN_PROMOTION("PIN_PROMOTION"),
    PIN_PROMOTION_TARGETING("PIN_PROMOTION_TARGETING"),
    KEYWORD("KEYWORD"),
    PRODUCT_GROUP("PRODUCT_GROUP"),
    PRODUCT_GROUP_TARGETING("PRODUCT_GROUP_TARGETING"),
    PRODUCT_ITEM("PRODUCT_ITEM"),
    PRODUCT_ITEM_TARGETING("PRODUCT_ITEM_TARGETING");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): MetricsReportingLevel {
                return values().first{it -> it.value == value}
        }
    }
}

