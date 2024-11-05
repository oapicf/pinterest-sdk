package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemResponse_anyOf_1.
  * @param itemId The catalog item id in the merchant namespace
  * @param errors Array with the errors for the item id requested
  * @param hotelId The catalog hotel id in the merchant namespace
  * @param creativeAssetsId The catalog creative assets id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ItemResponseAnyOf1(
  catalogType: CatalogsType,
  itemId: Option[String],
  errors: Option[List[ItemValidationEvent]],
  hotelId: Option[String],
  creativeAssetsId: Option[String]
)

object ItemResponseAnyOf1 {
  implicit lazy val itemResponseAnyOf1JsonFormat: Format[ItemResponseAnyOf1] = Json.format[ItemResponseAnyOf1]
}

