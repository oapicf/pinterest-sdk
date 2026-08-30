package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignDeliveryEstimatesDerivedMetrics._

case class CampaignDeliveryEstimatesDerivedMetrics (
  /* Estimated cost per click. */
  cpc: Option[Float],
/* Lower estimate of the cost per click. */
  cpcLower: Option[Float],
/* Upper estimate of the cost per click. */
  cpcUpper: Option[Float],
/* Estimated cost per thousand impressions. */
  cpm: Option[Float],
/* Lower estimate of cost per thousand impressions. */
  cpmLower: Option[Float],
/* Upper estimate of cost per thousand impressions. */
  cpmUpper: Option[Float],
/* Estimated lifetime frequency. */
  lifetimeFrequency: Option[Float],
/* Lower estimate of lifetime frequency. */
  lifetimeFrequencyLower: Option[Float],
/* Upper estimate of lifetime frequency. */
  lifetimeFrequencyUpper: Option[Float],
/* Estimated lifetime impressions. */
  lifetimeImpression: Option[Float],
/* Lower estimate of lifetime impressions. */
  lifetimeImpressionLower: Option[Float],
/* Upper estimate of lifetime impressions. */
  lifetimeImpressionUpper: Option[Float],
/* Estimated lifetime reach. */
  lifetimeReach: Option[Float],
/* Lower estimate of lifetime reach. */
  lifetimeReachLower: Option[Float],
/* Upper estimate of lifetime reach. */
  lifetimeReachUpper: Option[Float],
/* Estimated weekly clicks. */
  weeklyClick: Option[Float],
/* Lower estimate of weekly clicks. */
  weeklyClickLower: Option[Float],
/* Upper estimate of weekly clicks. */
  weeklyClickUpper: Option[Float],
/* Estimated weekly frequency. */
  weeklyFrequency: Option[Float],
/* Lower estimate of weekly frequency. */
  weeklyFrequencyLower: Option[Float],
/* Upper estimate of weekly frequency. */
  weeklyFrequencyUpper: Option[Float],
/* Estimated weekly impressions. */
  weeklyImpression: Option[Float],
/* Lower estimate of weekly impressions. */
  weeklyImpressionLower: Option[Float],
/* Upper estimate of weekly impressions. */
  weeklyImpressionUpper: Option[Float],
/* Estimated weekly reach. */
  weeklyReach: Option[Float],
/* Lower estimate of weekly reach. */
  weeklyReachLower: Option[Float],
/* Upper estimate of weekly reach. */
  weeklyReachUpper: Option[Float])

object CampaignDeliveryEstimatesDerivedMetrics {
  import DateTimeCodecs._

  implicit val CampaignDeliveryEstimatesDerivedMetricsCodecJson: CodecJson[CampaignDeliveryEstimatesDerivedMetrics] = CodecJson.derive[CampaignDeliveryEstimatesDerivedMetrics]
  implicit val CampaignDeliveryEstimatesDerivedMetricsDecoder: EntityDecoder[CampaignDeliveryEstimatesDerivedMetrics] = jsonOf[CampaignDeliveryEstimatesDerivedMetrics]
  implicit val CampaignDeliveryEstimatesDerivedMetricsEncoder: EntityEncoder[CampaignDeliveryEstimatesDerivedMetrics] = jsonEncoderOf[CampaignDeliveryEstimatesDerivedMetrics]
}
