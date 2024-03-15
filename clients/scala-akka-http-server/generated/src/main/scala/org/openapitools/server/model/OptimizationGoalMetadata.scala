package org.openapitools.server.model


/**
 * @param conversionTagV3GoalMetadata  for example: ''null''
 * @param frequencyGoalMetadata  for example: ''null''
 * @param scrollupGoalMetadata  for example: ''null''
*/
final case class OptimizationGoalMetadata (
  conversionTagV3GoalMetadata: Option[OptimizationGoalMetadataConversionTagV3GoalMetadata] = None,
  frequencyGoalMetadata: Option[OptimizationGoalMetadataFrequencyGoalMetadata] = None,
  scrollupGoalMetadata: Option[OptimizationGoalMetadataScrollupGoalMetadata] = None
)

