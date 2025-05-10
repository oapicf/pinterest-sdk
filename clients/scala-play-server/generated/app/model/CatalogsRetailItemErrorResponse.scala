package model

import play.api.libs.json._

/**
  * Object describing a retail item error
  * @param itemId The catalog item id in the merchant namespace
  * @param errors Array with the errors for the item id requested
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsRetailItemErrorResponse(
  catalogType: CatalogsType,
  itemId: Option[String],
  errors: Option[List[ItemValidationEvent]]
)

object CatalogsRetailItemErrorResponse {
  implicit lazy val catalogsRetailItemErrorResponseJsonFormat: Format[CatalogsRetailItemErrorResponse] = Json.format[CatalogsRetailItemErrorResponse]
}

