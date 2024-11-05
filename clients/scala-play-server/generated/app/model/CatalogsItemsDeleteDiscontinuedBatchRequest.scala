package model

import play.api.libs.json._

/**
  * Request object to discontinue catalogs items
  * @param items Array with catalogs items
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsItemsDeleteDiscontinuedBatchRequest(
  country: Country,
  language: CatalogsItemsRequestLanguage,
  operation: BatchOperation,
  items: List[ItemDeleteDiscontinuedBatchRecord]
)

object CatalogsItemsDeleteDiscontinuedBatchRequest {
  implicit lazy val catalogsItemsDeleteDiscontinuedBatchRequestJsonFormat: Format[CatalogsItemsDeleteDiscontinuedBatchRequest] = Json.format[CatalogsItemsDeleteDiscontinuedBatchRequest]
}

