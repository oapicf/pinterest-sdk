package model

import play.api.libs.json._

/**
  * Object describing a retail item error
  * @param errors Array with the errors for the item id requested
  * @param itemId The catalog item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsRetailItemErrorResponse(
  catalogType: CatalogsType,
  errors: List[ItemValidationEvent],
  itemId: Option[String]
)

object CatalogsRetailItemErrorResponse {
  implicit lazy val catalogsRetailItemErrorResponseJsonFormat: Format[CatalogsRetailItemErrorResponse] = Json.format[CatalogsRetailItemErrorResponse]
}

