package org.openapitools.server.model


/**
 * = BidFloorBody =
 *
 * @param bidFloorSpecs  for example: ''null''
 * @param targetingSpec  for example: ''null''
*/
final case class BidFloorRequest (
  bidFloorSpecs: Seq[BidFloorSpec],
  targetingSpec: Option[TargetingSpec] = None
)

