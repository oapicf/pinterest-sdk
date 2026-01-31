package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsRetailAvailableFilterValues.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsRetailAvailableFilterValues(
  catalogType: CatalogsRetailAvailableFilterValues.CatalogType.Value,
  filterValues: CatalogsRetailFilterValuesMap
)

object CatalogsRetailAvailableFilterValues {
  implicit lazy val catalogsRetailAvailableFilterValuesJsonFormat: Format[CatalogsRetailAvailableFilterValues] = Json.format[CatalogsRetailAvailableFilterValues]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val RETAIL = Value("RETAIL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

