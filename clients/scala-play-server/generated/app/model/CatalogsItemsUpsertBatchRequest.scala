package model

import play.api.libs.json._

/**
  * Request object to upsert catalogs items
  * @param items Array with catalogs items
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsItemsUpsertBatchRequest(
  country: Country,
  language: Language,
  operation: BatchOperation,
  items: List[ItemUpsertBatchRecord]
)

object CatalogsItemsUpsertBatchRequest {
  implicit lazy val catalogsItemsUpsertBatchRequestJsonFormat: Format[CatalogsItemsUpsertBatchRequest] = Json.format[CatalogsItemsUpsertBatchRequest]
}

