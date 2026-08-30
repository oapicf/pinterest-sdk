package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CampaignDeliveryEstimatesDerivedMetrics {
    /* Estimated cost per click. */
    Float cpc
    /* Lower estimate of the cost per click. */
    Float cpcLower
    /* Upper estimate of the cost per click. */
    Float cpcUpper
    /* Estimated cost per thousand impressions. */
    Float cpm
    /* Lower estimate of cost per thousand impressions. */
    Float cpmLower
    /* Upper estimate of cost per thousand impressions. */
    Float cpmUpper
    /* Estimated lifetime frequency. */
    Float lifetimeFrequency
    /* Lower estimate of lifetime frequency. */
    Float lifetimeFrequencyLower
    /* Upper estimate of lifetime frequency. */
    Float lifetimeFrequencyUpper
    /* Estimated lifetime impressions. */
    Float lifetimeImpression
    /* Lower estimate of lifetime impressions. */
    Float lifetimeImpressionLower
    /* Upper estimate of lifetime impressions. */
    Float lifetimeImpressionUpper
    /* Estimated lifetime reach. */
    Float lifetimeReach
    /* Lower estimate of lifetime reach. */
    Float lifetimeReachLower
    /* Upper estimate of lifetime reach. */
    Float lifetimeReachUpper
    /* Estimated weekly clicks. */
    Float weeklyClick
    /* Lower estimate of weekly clicks. */
    Float weeklyClickLower
    /* Upper estimate of weekly clicks. */
    Float weeklyClickUpper
    /* Estimated weekly frequency. */
    Float weeklyFrequency
    /* Lower estimate of weekly frequency. */
    Float weeklyFrequencyLower
    /* Upper estimate of weekly frequency. */
    Float weeklyFrequencyUpper
    /* Estimated weekly impressions. */
    Float weeklyImpression
    /* Lower estimate of weekly impressions. */
    Float weeklyImpressionLower
    /* Upper estimate of weekly impressions. */
    Float weeklyImpressionUpper
    /* Estimated weekly reach. */
    Float weeklyReach
    /* Lower estimate of weekly reach. */
    Float weeklyReachLower
    /* Upper estimate of weekly reach. */
    Float weeklyReachUpper
}
