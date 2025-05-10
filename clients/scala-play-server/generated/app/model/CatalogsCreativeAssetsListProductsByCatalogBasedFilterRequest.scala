package model

import play.api.libs.json._

/**
  * Request object to list products for a given creative assets catalog_id and product group filter.
  * @param catalogId Catalog id pertaining to the creative assets product group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest(
  catalogType: CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.CatalogType.Value,
  catalogId: String,
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

