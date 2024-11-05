package model

import play.api.libs.json._

/**
  * Object describing a hotel record
  * @param hotelId The catalog hotel id in the merchant namespace
  * @param pins The pins mapped to the item
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsHotelItemResponse(
  catalogType: CatalogsType,
  hotelId: Option[String],
  pins: Option[List[Pin]],
  attributes: Option[CatalogsHotelAttributes]
)

object CatalogsHotelItemResponse {
  implicit lazy val catalogsHotelItemResponseJsonFormat: Format[CatalogsHotelItemResponse] = Json.format[CatalogsHotelItemResponse]
}

