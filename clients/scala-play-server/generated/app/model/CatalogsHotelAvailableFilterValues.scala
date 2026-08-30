package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsHotelAvailableFilterValues.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsHotelAvailableFilterValues(
  catalogType: CatalogsHotelAvailableFilterValues.CatalogType.Value,
  filterValues: CatalogsHotelFilterValuesMap
)

object CatalogsHotelAvailableFilterValues {
  implicit lazy val catalogsHotelAvailableFilterValuesJsonFormat: Format[CatalogsHotelAvailableFilterValues] = Json.format[CatalogsHotelAvailableFilterValues]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val HOTEL = Value("HOTEL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

