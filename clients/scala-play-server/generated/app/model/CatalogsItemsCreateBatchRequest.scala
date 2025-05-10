package model

import play.api.libs.json._

/**
  * Request object to create catalogs items
  * @param items Array with catalogs items
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsItemsCreateBatchRequest(
  country: Country,
  language: CatalogsItemsRequestLanguage,
  operation: BatchOperation,
  items: List[ItemCreateBatchRecord]
)

object CatalogsItemsCreateBatchRequest {
  implicit lazy val catalogsItemsCreateBatchRequestJsonFormat: Format[CatalogsItemsCreateBatchRequest] = Json.format[CatalogsItemsCreateBatchRequest]
}

