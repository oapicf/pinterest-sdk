package model

import play.api.libs.json._

/**
  * Request object to discontinue catalogs items
  * @param items Array with catalogs items
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsItemsDeleteDiscontinuedBatchRequest(
  country: Country,
  language: Language,
  operation: BatchOperation,
  items: List[ItemDeleteDiscontinuedBatchRecord]
)

object CatalogsItemsDeleteDiscontinuedBatchRequest {
  implicit lazy val catalogsItemsDeleteDiscontinuedBatchRequestJsonFormat: Format[CatalogsItemsDeleteDiscontinuedBatchRequest] = Json.format[CatalogsItemsDeleteDiscontinuedBatchRequest]
}

