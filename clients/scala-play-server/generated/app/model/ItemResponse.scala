package model

import play.api.libs.json._

/**
  * Object describing an item record or error
  * @param itemId The catalog item id in the merchant namespace
  * @param pins The pins mapped to the item
  * @param hotelId The catalog hotel id in the merchant namespace
  * @param creativeAssetsId The catalog creative assets id in the merchant namespace
  * @param errors Array with the errors for the item id requested
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ItemResponse(
  catalogType: CatalogsType,
  attributes: Option[CatalogsCreativeAssetsAttributes],
  itemId: Option[String],
  pins: Option[List[Pin]],
  hotelId: Option[String],
  creativeAssetsId: Option[String],
  errors: List[ItemValidationEvent]
)

object ItemResponse {
  implicit lazy val itemResponseJsonFormat: Format[ItemResponse] = Json.format[ItemResponse]
}

