package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemResponse_anyOf.
  * @param itemId The catalog retail item id in the merchant namespace
  * @param pins The pins mapped to the item
  * @param hotelId The catalog hotel id in the merchant namespace
  * @param creativeAssetsId The catalog creative assets id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
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

