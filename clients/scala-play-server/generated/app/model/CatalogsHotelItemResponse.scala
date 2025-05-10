package model

import play.api.libs.json._

/**
  * Object describing a hotel record
  * @param hotelId The catalog hotel id in the merchant namespace
  * @param pins The pins mapped to the item
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsHotelItemResponse(
  catalogType: CatalogsType,
  hotelId: Option[String],
  pins: Option[List[Pin]],
  attributes: Option[CatalogsHotelAttributes]
)

object CatalogsHotelItemResponse {
  implicit lazy val catalogsHotelItemResponseJsonFormat: Format[CatalogsHotelItemResponse] = Json.format[CatalogsHotelItemResponse]
}

