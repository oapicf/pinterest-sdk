package model

import play.api.libs.json._

/**
  * Object describing a creative assets item error
  * @param creativeAssetsId The catalog creative assets id in the merchant namespace
  * @param errors Array with the errors for the item id requested
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsCreativeAssetsItemErrorResponse(
  catalogType: CatalogsType,
  creativeAssetsId: Option[String],
  errors: Option[List[ItemValidationEvent]]
)

object CatalogsCreativeAssetsItemErrorResponse {
  implicit lazy val catalogsCreativeAssetsItemErrorResponseJsonFormat: Format[CatalogsCreativeAssetsItemErrorResponse] = Json.format[CatalogsCreativeAssetsItemErrorResponse]
}

