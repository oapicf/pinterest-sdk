package model

import play.api.libs.json._

/**
  * Ad group configuration for delivery estimates.
  * @param creativeTypes Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  * @param keywords Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
  * @param monthlyFrequencyCap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.
  * @param optimizationType Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.
  * @param productGroupIds [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdGroupDeliveryEstimates(
  autoTargetingEnabled: Option[Boolean],
  creativeTypes: Option[List[AdGroupAudienceSizingCreativeTypes]],
  keywords: Option[List[AdGroupDeliveryEstimatesKeywordsItems]],
  monthlyFrequencyCap: Option[Int],
  optimizationGoalMetadata: Option[OptimizationGoalMetadata],
  optimizationType: Option[OptimizationType],
  placementGroup: Option[PlacementGroupType],
  productGroupIds: Option[List[String]],
  targetingSpec: Option[TargetingSpecOptimal]
)

object AdGroupDeliveryEstimates {
  implicit lazy val adGroupDeliveryEstimatesJsonFormat: Format[AdGroupDeliveryEstimates] = Json.format[AdGroupDeliveryEstimates]
}

