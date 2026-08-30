package model

import play.api.libs.json._

/**
  * Derived metrics for an ad campaign.
  * @param cpc Estimated cost per click.
  * @param cpcLower Lower estimate of the cost per click.
  * @param cpcUpper Upper estimate of the cost per click.
  * @param cpm Estimated cost per thousand impressions.
  * @param cpmLower Lower estimate of cost per thousand impressions.
  * @param cpmUpper Upper estimate of cost per thousand impressions.
  * @param lifetimeFrequency Estimated lifetime frequency.
  * @param lifetimeFrequencyLower Lower estimate of lifetime frequency.
  * @param lifetimeFrequencyUpper Upper estimate of lifetime frequency.
  * @param lifetimeImpression Estimated lifetime impressions.
  * @param lifetimeImpressionLower Lower estimate of lifetime impressions.
  * @param lifetimeImpressionUpper Upper estimate of lifetime impressions.
  * @param lifetimeReach Estimated lifetime reach.
  * @param lifetimeReachLower Lower estimate of lifetime reach.
  * @param lifetimeReachUpper Upper estimate of lifetime reach.
  * @param weeklyClick Estimated weekly clicks.
  * @param weeklyClickLower Lower estimate of weekly clicks.
  * @param weeklyClickUpper Upper estimate of weekly clicks.
  * @param weeklyFrequency Estimated weekly frequency.
  * @param weeklyFrequencyLower Lower estimate of weekly frequency.
  * @param weeklyFrequencyUpper Upper estimate of weekly frequency.
  * @param weeklyImpression Estimated weekly impressions.
  * @param weeklyImpressionLower Lower estimate of weekly impressions.
  * @param weeklyImpressionUpper Upper estimate of weekly impressions.
  * @param weeklyReach Estimated weekly reach.
  * @param weeklyReachLower Lower estimate of weekly reach.
  * @param weeklyReachUpper Upper estimate of weekly reach.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CampaignDeliveryEstimatesDerivedMetrics(
  cpc: Option[Float],
  cpcLower: Option[Float],
  cpcUpper: Option[Float],
  cpm: Option[Float],
  cpmLower: Option[Float],
  cpmUpper: Option[Float],
  lifetimeFrequency: Option[Float],
  lifetimeFrequencyLower: Option[Float],
  lifetimeFrequencyUpper: Option[Float],
  lifetimeImpression: Option[Float],
  lifetimeImpressionLower: Option[Float],
  lifetimeImpressionUpper: Option[Float],
  lifetimeReach: Option[Float],
  lifetimeReachLower: Option[Float],
  lifetimeReachUpper: Option[Float],
  weeklyClick: Option[Float],
  weeklyClickLower: Option[Float],
  weeklyClickUpper: Option[Float],
  weeklyFrequency: Option[Float],
  weeklyFrequencyLower: Option[Float],
  weeklyFrequencyUpper: Option[Float],
  weeklyImpression: Option[Float],
  weeklyImpressionLower: Option[Float],
  weeklyImpressionUpper: Option[Float],
  weeklyReach: Option[Float],
  weeklyReachLower: Option[Float],
  weeklyReachUpper: Option[Float]
)

object CampaignDeliveryEstimatesDerivedMetrics {
  implicit lazy val campaignDeliveryEstimatesDerivedMetricsJsonFormat: Format[CampaignDeliveryEstimatesDerivedMetrics] = Json.format[CampaignDeliveryEstimatesDerivedMetrics]
}

