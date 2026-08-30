package model

import play.api.libs.json._

/**
  * Request object to list products for a given retail catalog_id and product group filter.
  * @param catalogId Catalog ID pertaining to the product group.
  * @param catalogType Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsRetailListProductsByCatalogBasedFilterRequest(
  catalogId: String,
  catalogType: CatalogsRetailListProductsByCatalogBasedFilterRequest.CatalogType.Value,
  country: Country,
  filters: CatalogsProductGroupFilters,
  locale: CatalogsLocale
)

object CatalogsRetailListProductsByCatalogBasedFilterRequest {
  implicit lazy val catalogsRetailListProductsByCatalogBasedFilterRequestJsonFormat: Format[CatalogsRetailListProductsByCatalogBasedFilterRequest] = Json.format[CatalogsRetailListProductsByCatalogBasedFilterRequest]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val RETAIL = Value("RETAIL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

