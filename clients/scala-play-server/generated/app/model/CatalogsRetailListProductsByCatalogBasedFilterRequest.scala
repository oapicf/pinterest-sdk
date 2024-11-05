package model

import play.api.libs.json._

/**
  * Request object to list products for a given retail catalog_id and product group filter.
  * @param catalogType Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
  * @param catalogId Catalog id pertaining to the retail product group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsRetailListProductsByCatalogBasedFilterRequest(
  catalogType: CatalogsRetailListProductsByCatalogBasedFilterRequest.CatalogType.Value,
  catalogId: String,
  filters: CatalogsProductGroupFilters,
  country: Country,
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

