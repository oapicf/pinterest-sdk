package model

import play.api.libs.json._

/**
  * Request object to list products for a given creative assets catalog_id and product group filter.
  * @param catalogId Catalog ID pertaining to the product group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest(
  catalogId: String,
  catalogType: CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.CatalogType.Value,
  filters: CatalogsCreativeAssetsProductGroupFilters
)

object CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest {
  implicit lazy val catalogsCreativeAssetsListProductsByCatalogBasedFilterRequestJsonFormat: Format[CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest] = Json.format[CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

