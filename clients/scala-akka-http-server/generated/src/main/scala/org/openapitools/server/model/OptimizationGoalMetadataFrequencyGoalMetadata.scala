package org.openapitools.server.model


/**
 * @param frequency  for example: ''null''
 * @param timerange User entity counts time range for example: ''DAY''
*/
final case class OptimizationGoalMetadataFrequencyGoalMetadata (
  frequency: Option[Int] = None,
  timerange: Option[String] = None
)

