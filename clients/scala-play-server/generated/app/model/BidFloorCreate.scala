package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param bidFloorSpecs List of bid floor specifications.
  * @param targetingSpec Ad group targeting specification defining the ad group target audience.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BidFloorCreate(
  bidFloorSpecs: List[BidFloorSpec],
  targetingSpec: Option[TargetingSpecOptimal]
)

object BidFloorCreate {
  implicit lazy val bidFloorCreateJsonFormat: Format[BidFloorCreate] = Json.format[BidFloorCreate]
}

