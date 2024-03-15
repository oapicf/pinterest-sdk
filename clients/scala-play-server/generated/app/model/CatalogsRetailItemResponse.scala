package model

import play.api.libs.json._

/**
  * Object describing a retail item record
  * @param itemId The catalog retail item id in the merchant namespace
  * @param pins The pins mapped to the item
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsRetailItemResponse(
  catalogType: CatalogsType,
  itemId: Option[String],
  pins: Option[List[Pin]],
  attributes: Option[ItemAttributes]
)

object CatalogsRetailItemResponse {
  implicit lazy val catalogsRetailItemResponseJsonFormat: Format[CatalogsRetailItemResponse] = Json.format[CatalogsRetailItemResponse]
}

