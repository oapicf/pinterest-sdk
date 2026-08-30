package org.openapitools.server.model


/**
 * Frequency target can only be between 2 and 20
 *
 * @param frequency  for example: ''null''
 * @param timerange  for example: ''null''
*/
final case class FrequencyGoalMetadata (
  frequency: Option[Int] = None,
  timerange: Option[FrequencyGoalMetadataTimerange] = None
)

