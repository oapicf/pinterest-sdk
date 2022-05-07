package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
* Level of the reporting request
* Values: aDVERTISER,aDVERTISERTARGETING,cAMPAIGN,cAMPAIGNTARGETING,aDGROUP,aDGROUPTARGETING,pINPROMOTION,pINPROMOTIONTARGETING,kEYWORD,pRODUCTGROUP,pRODUCTGROUPTARGETING,pRODUCTITEM
*/
enum class MetricsReportingLevel(val value: kotlin.String) {

    @JsonProperty("ADVERTISER") aDVERTISER("ADVERTISER"),

    @JsonProperty("ADVERTISER_TARGETING") aDVERTISERTARGETING("ADVERTISER_TARGETING"),

    @JsonProperty("CAMPAIGN") cAMPAIGN("CAMPAIGN"),

    @JsonProperty("CAMPAIGN_TARGETING") cAMPAIGNTARGETING("CAMPAIGN_TARGETING"),

    @JsonProperty("AD_GROUP") aDGROUP("AD_GROUP"),

    @JsonProperty("AD_GROUP_TARGETING") aDGROUPTARGETING("AD_GROUP_TARGETING"),

    @JsonProperty("PIN_PROMOTION") pINPROMOTION("PIN_PROMOTION"),

    @JsonProperty("PIN_PROMOTION_TARGETING") pINPROMOTIONTARGETING("PIN_PROMOTION_TARGETING"),

    @JsonProperty("KEYWORD") kEYWORD("KEYWORD"),

    @JsonProperty("PRODUCT_GROUP") pRODUCTGROUP("PRODUCT_GROUP"),

    @JsonProperty("PRODUCT_GROUP_TARGETING") pRODUCTGROUPTARGETING("PRODUCT_GROUP_TARGETING"),

    @JsonProperty("PRODUCT_ITEM") pRODUCTITEM("PRODUCT_ITEM");

}

