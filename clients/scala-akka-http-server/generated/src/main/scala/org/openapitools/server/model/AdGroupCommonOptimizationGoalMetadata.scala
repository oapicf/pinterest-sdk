package org.openapitools.server.model


/**
 * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
 *
 * @param conversionTagV3GoalMetadata  for example: ''null''
 * @param frequencyGoalMetadata  for example: ''null''
 * @param scrollupGoalMetadata  for example: ''null''
*/
final case class AdGroupCommonOptimizationGoalMetadata (
  conversionTagV3GoalMetadata: Option[OptimizationGoalMetadataConversionTagV3GoalMetadata] = None,
  frequencyGoalMetadata: Option[OptimizationGoalMetadataFrequencyGoalMetadata] = None,
  scrollupGoalMetadata: Option[OptimizationGoalMetadataScrollupGoalMetadata] = None
)

