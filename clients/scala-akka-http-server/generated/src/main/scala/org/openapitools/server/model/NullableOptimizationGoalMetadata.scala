package org.openapitools.server.model


/**
 * @param conversionTagV3GoalMetadata  for example: ''null''
 * @param frequencyGoalMetadata  for example: ''null''
 * @param scrollupGoalMetadata  for example: ''null''
*/
final case class NullableOptimizationGoalMetadata (
  conversionTagV3GoalMetadata: Option[ConversionTagV3GoalMetadata] = None,
  frequencyGoalMetadata: Option[FrequencyGoalMetadata] = None,
  scrollupGoalMetadata: Option[ScrollupGoalMetadata] = None
)

