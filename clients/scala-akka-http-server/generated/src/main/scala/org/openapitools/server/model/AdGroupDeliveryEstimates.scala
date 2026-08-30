package org.openapitools.server.model


/**
 * Ad group configuration for delivery estimates.
 *
 * @param autoTargetingEnabled  for example: ''null''
 * @param creativeTypes Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. for example: ''null''
 * @param keywords Array of keyword objects. If the keywords field is missing, all keywords will be targeted. for example: ''null''
 * @param monthlyFrequencyCap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. for example: ''null''
 * @param optimizationGoalMetadata  for example: ''null''
 * @param optimizationType Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise. for example: ''null''
 * @param placementGroup  for example: ''null''
 * @param productGroupIds [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns. for example: ''null''
 * @param targetingSpec  for example: ''null''
*/
final case class AdGroupDeliveryEstimates (
  autoTargetingEnabled: Option[Boolean] = None,
  creativeTypes: Option[Seq[AdGroupAudienceSizingCreativeTypes]] = None,
  keywords: Option[Seq[AdGroupDeliveryEstimatesKeywordsItems]] = None,
  monthlyFrequencyCap: Option[Int] = None,
  optimizationGoalMetadata: Option[OptimizationGoalMetadata] = None,
  optimizationType: Option[OptimizationType] = None,
  placementGroup: Option[PlacementGroupType] = None,
  productGroupIds: Option[Seq[String]] = None,
  targetingSpec: Option[TargetingSpecOptimal] = None
)

