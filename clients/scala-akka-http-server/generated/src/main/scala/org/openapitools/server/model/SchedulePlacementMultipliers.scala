package org.openapitools.server.model


/**
 * This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 *
 * @param browse Browse (home-feed and related surfaces) for example: ''null''
 * @param relatedPins Related-Pins placement for example: ''null''
 * @param search Search placement for example: ''null''
*/
final case class SchedulePlacementMultipliers (
  browse: Option[Double] = None,
  relatedPins: Option[Double] = None,
  search: Option[Double] = None
)

