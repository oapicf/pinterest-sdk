package model

import play.api.libs.json._

/**
  * Error item response
  * @param itemId The catalog item id in the merchant namespace
  * @param hotelId The catalog hotel id in the merchant namespace
  * @param creativeAssetsId The catalog creative assets id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ItemResponseOneOf1(
  catalogType: CatalogsType,
  errors: List[ItemValidationEvent],
  itemId: Option[String],
  hotelId: Option[String],
  creativeAssetsId: Option[String]
)

object ItemResponseOneOf1 {
  implicit lazy val itemResponseOneOf1JsonFormat: Format[ItemResponseOneOf1] = Json.format[ItemResponseOneOf1]
}

