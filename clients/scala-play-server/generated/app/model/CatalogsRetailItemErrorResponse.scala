package model

import play.api.libs.json._

/**
  * Object describing a retail item error
  * @param itemId The catalog item id in the merchant namespace
  * @param errors Array with the errors for the item id requested
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsRetailItemErrorResponse(
  catalogType: CatalogsType,
  itemId: Option[String],
  errors: Option[List[ItemValidationEvent]]
)

object CatalogsRetailItemErrorResponse {
  implicit lazy val catalogsRetailItemErrorResponseJsonFormat: Format[CatalogsRetailItemErrorResponse] = Json.format[CatalogsRetailItemErrorResponse]
}

