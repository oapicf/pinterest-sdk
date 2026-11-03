package model

import play.api.libs.json._

/**
  * Request object to list products for a given product group filter.
  * @param feedId Catalog Feed id pertaining to the catalog product group filter.
  * @param catalogId Catalog ID pertaining to the product group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsListProductsByFilterRequest(
  feedId: String,
  filters: CatalogsCreativeAssetsProductGroupFilters,
  catalogId: String,
  catalogType: CatalogsListProductsByFilterRequest.CatalogType.Value,
  country: Country,
  locale: CatalogsLocale
)

object CatalogsListProductsByFilterRequest {
  implicit lazy val catalogsListProductsByFilterRequestJsonFormat: Format[CatalogsListProductsByFilterRequest] = Json.format[CatalogsListProductsByFilterRequest]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

