package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemResponse_anyOf.
  * @param itemId The catalog retail item id in the merchant namespace
  * @param pins The pins mapped to the item
  * @param hotelId The catalog hotel id in the merchant namespace
  * @param creativeAssetsId The catalog creative assets id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ItemResponseAnyOf(
  catalogType: CatalogsType,
  itemId: Option[String],
  pins: Option[List[Pin]],
  attributes: Option[CatalogsCreativeAssetsAttributes],
  hotelId: Option[String],
  creativeAssetsId: Option[String]
)

object ItemResponseAnyOf {
  implicit lazy val itemResponseAnyOfJsonFormat: Format[ItemResponseAnyOf] = Json.format[ItemResponseAnyOf]
}

