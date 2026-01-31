package model

import play.api.libs.json._

/**
  * Successful item response
  * @param itemId The catalog retail item id in the merchant namespace
  * @param pins The pins mapped to the item
  * @param hotelId The catalog hotel id in the merchant namespace
  * @param creativeAssetsId The catalog creative assets id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ItemResponseOneOf(
  catalogType: CatalogsType,
  attributes: Option[CatalogsCreativeAssetsAttributes],
  itemId: Option[String],
  pins: Option[List[Pin]],
  hotelId: Option[String],
  creativeAssetsId: Option[String]
)

object ItemResponseOneOf {
  implicit lazy val itemResponseOneOfJsonFormat: Format[ItemResponseOneOf] = Json.format[ItemResponseOneOf]
}

