package org.openapitools.server.model


/**
 * @param frequency Frequency target can only be between 2 and 20 for example: ''null''
 * @param timerange User entity counts time range for example: ''DAY''
*/
final case class OptimizationGoalMetadataFrequencyGoalMetadata (
  frequency: Option[Int] = None,
  timerange: Option[String] = None
)

