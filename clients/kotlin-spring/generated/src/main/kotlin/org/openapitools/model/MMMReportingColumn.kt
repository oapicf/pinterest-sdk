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
* Marketing Mix Modeling (MMM) Reporting Columns
* Values: SPEND_IN_DOLLAR,SPEND_IN_MICRO_DOLLAR,ECPC_IN_DOLLAR,ECTR,CAMPAIGN_NAME,TOTAL_ENGAGEMENT,EENGAGEMENT_RATE,ECPM_IN_DOLLAR,CAMPAIGN_ID,ADVERTISER_ID,AD_GROUP_ID,AD_GROUP_NAME,CLICKTHROUGH_1,IMPRESSION_1,CLICKTHROUGH_2,IMPRESSION_2,TOTAL_CLICKTHROUGH,TOTAL_IMPRESSION,ADVERTISER_NAME,SPEND_ORDER_LINE_PAID_TYPE
*/
enum class MMMReportingColumn(@get:JsonValue val value: kotlin.String) {

    SPEND_IN_DOLLAR("SPEND_IN_DOLLAR"),
    SPEND_IN_MICRO_DOLLAR("SPEND_IN_MICRO_DOLLAR"),
    ECPC_IN_DOLLAR("ECPC_IN_DOLLAR"),
    ECTR("ECTR"),
    CAMPAIGN_NAME("CAMPAIGN_NAME"),
    TOTAL_ENGAGEMENT("TOTAL_ENGAGEMENT"),
    EENGAGEMENT_RATE("EENGAGEMENT_RATE"),
    ECPM_IN_DOLLAR("ECPM_IN_DOLLAR"),
    CAMPAIGN_ID("CAMPAIGN_ID"),
    ADVERTISER_ID("ADVERTISER_ID"),
    AD_GROUP_ID("AD_GROUP_ID"),
    AD_GROUP_NAME("AD_GROUP_NAME"),
    CLICKTHROUGH_1("CLICKTHROUGH_1"),
    IMPRESSION_1("IMPRESSION_1"),
    CLICKTHROUGH_2("CLICKTHROUGH_2"),
    IMPRESSION_2("IMPRESSION_2"),
    TOTAL_CLICKTHROUGH("TOTAL_CLICKTHROUGH"),
    TOTAL_IMPRESSION("TOTAL_IMPRESSION"),
    ADVERTISER_NAME("ADVERTISER_NAME"),
    SPEND_ORDER_LINE_PAID_TYPE("SPEND_ORDER_LINE_PAID_TYPE");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): MMMReportingColumn {
                return values().first{it -> it.value == value}
        }
    }
}

