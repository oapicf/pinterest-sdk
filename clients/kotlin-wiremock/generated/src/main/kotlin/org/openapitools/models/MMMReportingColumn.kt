@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class MMMReportingColumn {
    @JsonProperty(value = "SPEND_IN_DOLLAR") SPEND_IN_DOLLAR,
    @JsonProperty(value = "SPEND_IN_MICRO_DOLLAR") SPEND_IN_MICRO_DOLLAR,
    @JsonProperty(value = "ECPC_IN_DOLLAR") ECPC_IN_DOLLAR,
    @JsonProperty(value = "ECTR") ECTR,
    @JsonProperty(value = "CAMPAIGN_NAME") CAMPAIGN_NAME,
    @JsonProperty(value = "TOTAL_ENGAGEMENT") TOTAL_ENGAGEMENT,
    @JsonProperty(value = "EENGAGEMENT_RATE") EENGAGEMENT_RATE,
    @JsonProperty(value = "ECPM_IN_DOLLAR") ECPM_IN_DOLLAR,
    @JsonProperty(value = "CAMPAIGN_ID") CAMPAIGN_ID,
    @JsonProperty(value = "ADVERTISER_ID") ADVERTISER_ID,
    @JsonProperty(value = "AD_GROUP_ID") AD_GROUP_ID,
    @JsonProperty(value = "AD_GROUP_NAME") AD_GROUP_NAME,
    @JsonProperty(value = "CLICKTHROUGH_1") CLICKTHROUGH_1,
    @JsonProperty(value = "IMPRESSION_1") IMPRESSION_1,
    @JsonProperty(value = "CLICKTHROUGH_2") CLICKTHROUGH_2,
    @JsonProperty(value = "IMPRESSION_2") IMPRESSION_2,
    @JsonProperty(value = "TOTAL_CLICKTHROUGH") TOTAL_CLICKTHROUGH,
    @JsonProperty(value = "TOTAL_IMPRESSION") TOTAL_IMPRESSION,
    @JsonProperty(value = "ADVERTISER_NAME") ADVERTISER_NAME,
    @JsonProperty(value = "SPEND_ORDER_LINE_PAID_TYPE") SPEND_ORDER_LINE_PAID_TYPE,
    @JsonProperty(value = "CAMPAIGN_OBJECTIVE_TYPE") CAMPAIGN_OBJECTIVE_TYPE,
    @JsonProperty(value = "PINNER_LIST_NAME") PINNER_LIST_NAME,
    @JsonProperty(value = "ADS_CREDIT_SPEND_IN_DOLLAR") ADS_CREDIT_SPEND_IN_DOLLAR,
    @JsonProperty(value = "ADVERTISER_PAID_SPEND_IN_DOLLAR") ADVERTISER_PAID_SPEND_IN_DOLLAR,
    @JsonProperty(value = "ADVERTISER_PAID_ECPC_IN_DOLLAR") ADVERTISER_PAID_ECPC_IN_DOLLAR,
    @JsonProperty(value = "ADVERTISER_PAID_ECPM_IN_DOLLAR") ADVERTISER_PAID_ECPM_IN_DOLLAR,
}
