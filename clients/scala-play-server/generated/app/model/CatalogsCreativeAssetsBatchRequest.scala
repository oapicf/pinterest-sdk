package model

import play.api.libs.json._

/**
  * Request object to update catalogs creative assets items
  * @param items Array with creative assets item operations
  * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsCreativeAssetsBatchRequest(
  catalogType: CatalogsCreativeAssetsBatchRequest.CatalogType.Value,
  country: Country,
  language: CatalogsItemsRequestLanguage,
  items: List[CatalogsCreativeAssetsBatchItem],
  catalogId: Option[String]
)

object CatalogsCreativeAssetsBatchRequest {
  implicit lazy val catalogsCreativeAssetsBatchRequestJsonFormat: Format[CatalogsCreativeAssetsBatchRequest] = Json.format[CatalogsCreativeAssetsBatchRequest]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

