package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupDeliveryEstimates._

case class AdGroupDeliveryEstimates (
  autoTargetingEnabled: Option[Boolean],
/* Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. */
  creativeTypes: Option[List[AdGroupAudienceSizingCreativeTypes]],
/* Array of keyword objects. If the keywords field is missing, all keywords will be targeted. */
  keywords: Option[List[AdGroupDeliveryEstimatesKeywordsItems]],
/* Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. */
  monthlyFrequencyCap: Option[Integer],
optimizationGoalMetadata: Option[OptimizationGoalMetadata],
/* Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise. */
  optimizationType: Option[OptimizationType],
placementGroup: Option[PlacementGroupType],
/* [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns. */
  productGroupIds: Option[List[String]],
targetingSpec: Option[TargetingSpecOptimal])

object AdGroupDeliveryEstimates {
  import DateTimeCodecs._

  implicit val AdGroupDeliveryEstimatesCodecJson: CodecJson[AdGroupDeliveryEstimates] = CodecJson.derive[AdGroupDeliveryEstimates]
  implicit val AdGroupDeliveryEstimatesDecoder: EntityDecoder[AdGroupDeliveryEstimates] = jsonOf[AdGroupDeliveryEstimates]
  implicit val AdGroupDeliveryEstimatesEncoder: EntityEncoder[AdGroupDeliveryEstimates] = jsonEncoderOf[AdGroupDeliveryEstimates]
}
