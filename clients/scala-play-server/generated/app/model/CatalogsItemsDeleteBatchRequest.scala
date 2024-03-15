package model

import play.api.libs.json._

/**
  * Request object to delete catalogs items
  * @param items Array with catalogs items
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsItemsDeleteBatchRequest(
  country: Country,
  language: Language,
  operation: BatchOperation,
  items: List[ItemDeleteBatchRecord]
)

object CatalogsItemsDeleteBatchRequest {
  implicit lazy val catalogsItemsDeleteBatchRequestJsonFormat: Format[CatalogsItemsDeleteBatchRequest] = Json.format[CatalogsItemsDeleteBatchRequest]
}

