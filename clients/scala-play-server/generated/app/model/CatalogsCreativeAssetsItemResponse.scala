package model

import play.api.libs.json._

/**
  * Object describing a hotel record
  * @param creativeAssetsId The catalog creative assets id in the merchant namespace
  * @param pins The pins mapped to the item
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsCreativeAssetsItemResponse(
  attributes: Option[CatalogsCreativeAssetsAttributes],
  catalogType: CatalogsType,
  creativeAssetsId: Option[String],
  pins: Option[List[Pin]]
)

object CatalogsCreativeAssetsItemResponse {
  implicit lazy val catalogsCreativeAssetsItemResponseJsonFormat: Format[CatalogsCreativeAssetsItemResponse] = Json.format[CatalogsCreativeAssetsItemResponse]
}

