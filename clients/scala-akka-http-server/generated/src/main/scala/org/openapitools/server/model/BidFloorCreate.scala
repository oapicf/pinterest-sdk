package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param bidFloorSpecs List of bid floor specifications. for example: ''null''
 * @param targetingSpec Ad group targeting specification defining the ad group target audience. for example: ''null''
*/
final case class BidFloorCreate (
  bidFloorSpecs: Seq[BidFloorSpec],
  targetingSpec: Option[TargetingSpecOptimal] = None
)

