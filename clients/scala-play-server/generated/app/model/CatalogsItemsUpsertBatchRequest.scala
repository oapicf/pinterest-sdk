package model

import play.api.libs.json._

/**
  * Request object to upsert catalogs items
  * @param items Array with catalogs items
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsItemsUpsertBatchRequest(
  country: Country,
  language: CatalogsItemsRequestLanguage,
  operation: BatchOperation,
  items: List[ItemUpsertBatchRecord]
)

object CatalogsItemsUpsertBatchRequest {
  implicit lazy val catalogsItemsUpsertBatchRequestJsonFormat: Format[CatalogsItemsUpsertBatchRequest] = Json.format[CatalogsItemsUpsertBatchRequest]
}

