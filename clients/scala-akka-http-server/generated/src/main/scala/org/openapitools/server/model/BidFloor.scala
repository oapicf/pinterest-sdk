package org.openapitools.server.model


/**
 * = BidFloor =
 *
 * @param bidFloors A list of bid floors in micro currency. For example, [100000, 200000] for example: ''[100000,200000]''
 * @param `type` Always the string 'bidfloor' for example: ''bidfloor''
*/
final case class BidFloor (
  bidFloors: Option[Seq[Int]] = None,
  `type`: Option[String] = None
)

