package model

import play.api.libs.json._

/**
  * Bid floor request and response model.
  * @param bidFloors A list of bid floors in micro currency. For example, [100000, 200000]
  * @param `type` Always the string 'bidfloor'.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BidFloor(
  bidFloors: Option[List[Int]],
  `type`: Option[String]
)

object BidFloor {
  implicit lazy val bidFloorJsonFormat: Format[BidFloor] = Json.format[BidFloor]
}

