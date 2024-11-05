package model

import play.api.libs.json._

/**
  * Request object for updating a retail product group.
  * @param catalogType Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsRetailProductGroupUpdateRequest(
  catalogType: Option[CatalogsRetailProductGroupUpdateRequest.CatalogType.Value],
  name: Option[String],
  description: Option[String],
  filters: Option[CatalogsProductGroupFiltersRequest],
  country: Option[Country],
  locale: Option[CatalogsLocale]
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

