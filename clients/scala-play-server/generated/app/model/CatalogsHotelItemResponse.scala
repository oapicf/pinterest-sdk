package model

import play.api.libs.json._

/**
  * Object describing a hotel record
  * @param hotelId The catalog hotel id in the merchant namespace
  * @param pins The pins mapped to the item
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsHotelItemResponse(
  catalogType: CatalogsType,
  hotelId: Option[String],
  pins: Option[List[Pin]],
  attributes: Option[CatalogsHotelAttributes]
)

object CatalogsHotelItemResponse {
  implicit lazy val catalogsHotelItemResponseJsonFormat: Format[CatalogsHotelItemResponse] = Json.format[CatalogsHotelItemResponse]
}

