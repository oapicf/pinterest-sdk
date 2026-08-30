package org.openapitools.server.model


/**
 * This represents a mapping from age bucket to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 *
 * @param AGE_BUCKET  for example: ''null''
*/
final case class ScheduleAgeBucketMultipliers (
  AGE_BUCKET: Option[String] = None
)

