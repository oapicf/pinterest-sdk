package org.openapitools.server.model


/**
 * @param attributionWindows  for example: ''null''
 * @param conversionEvent  for example: ''null''
 * @param conversionTagId  for example: ''null''
 * @param cpaGoalValueInMicroCurrency  for example: ''null''
 * @param isRoasOptimized Ad group is ROAS optimized for example: ''null''
 * @param learningModeType Conversion learning model type for example: ''ACTIVE''
*/
final case class OptimizationGoalMetadataConversionTagV3GoalMetadata (
  attributionWindows: Option[OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows] = None,
  conversionEvent: Option[String] = None,
  conversionTagId: Option[String] = None,
  cpaGoalValueInMicroCurrency: Option[String] = None,
  isRoasOptimized: Option[Boolean] = None,
  learningModeType: Option[String] = None
)

