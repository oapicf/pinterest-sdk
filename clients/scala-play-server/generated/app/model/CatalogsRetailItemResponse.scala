package model

import play.api.libs.json._

/**
  * Object describing a retail item record
  * @param itemId The catalog retail item id in the merchant namespace
  * @param pins The pins mapped to the item
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsRetailItemResponse(
  attributes: Option[ItemAttributes],
  catalogType: CatalogsType,
  itemId: Option[String],
  pins: Option[List[Pin]]
)

object CatalogsRetailItemResponse {
  implicit lazy val catalogsRetailItemResponseJsonFormat: Format[CatalogsRetailItemResponse] = Json.format[CatalogsRetailItemResponse]
}

