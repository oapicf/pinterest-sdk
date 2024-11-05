package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for items_batch_post_request.
  * @param items Array with catalogs items
  * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ItemsBatchPostRequest(
  catalogType: ItemsBatchPostRequest.CatalogType.Value,
  country: Country,
  language: CatalogsItemsRequestLanguage,
  items: List[ItemDeleteBatchRecord],
  catalogId: Option[String],
  operation: BatchOperation
)

object ItemsBatchPostRequest {
  implicit lazy val itemsBatchPostRequestJsonFormat: Format[ItemsBatchPostRequest] = Json.format[ItemsBatchPostRequest]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

