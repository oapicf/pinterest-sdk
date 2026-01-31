package model

import play.api.libs.json._

/**
  * Request object for creating a product group.
  * @param catalogType Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
  * @param catalogId Catalog id pertaining to the retail product group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsRetailProductGroupCreateRequest(
  catalogType: CatalogsRetailProductGroupCreateRequest.CatalogType.Value,
  name: String,
  description: Option[String],
  filters: CatalogsProductGroupFiltersRequest,
  catalogId: String,
  country: Country,
  locale: CatalogsLocale
)

object CatalogsRetailProductGroupCreateRequest {
  implicit lazy val catalogsRetailProductGroupCreateRequestJsonFormat: Format[CatalogsRetailProductGroupCreateRequest] = Json.format[CatalogsRetailProductGroupCreateRequest]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val RETAIL = Value("RETAIL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

