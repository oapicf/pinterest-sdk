package model

import play.api.libs.json._

/**
  * Object describing a hotel record
  * @param creativeAssetsId The catalog creative assets id in the merchant namespace
  * @param pins The pins mapped to the item
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsCreativeAssetsItemResponse(
  catalogType: CatalogsType,
  creativeAssetsId: Option[String],
  pins: Option[List[Pin]],
  attributes: Option[CatalogsCreativeAssetsAttributes]
)

object CatalogsCreativeAssetsItemResponse {
  implicit lazy val catalogsCreativeAssetsItemResponseJsonFormat: Format[CatalogsCreativeAssetsItemResponse] = Json.format[CatalogsCreativeAssetsItemResponse]
}

