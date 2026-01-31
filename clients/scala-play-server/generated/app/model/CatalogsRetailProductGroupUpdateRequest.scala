package model

import play.api.libs.json._

/**
  * Request object for updating a retail product group.
  * @param catalogType Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsRetailProductGroupUpdateRequest(
  catalogType: Option[CatalogsRetailProductGroupUpdateRequest.CatalogType.Value],
  country: Option[Country],
  description: Option[String],
  filters: Option[CatalogsProductGroupFiltersRequest],
  locale: Option[CatalogsLocale],
  name: Option[String]
)

object CatalogsRetailProductGroupUpdateRequest {
  implicit lazy val catalogsRetailProductGroupUpdateRequestJsonFormat: Format[CatalogsRetailProductGroupUpdateRequest] = Json.format[CatalogsRetailProductGroupUpdateRequest]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val RETAIL = Value("RETAIL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

