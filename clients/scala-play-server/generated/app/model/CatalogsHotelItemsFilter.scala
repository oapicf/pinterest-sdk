package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsHotelItemsFilter.
  * @param catalogId Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsHotelItemsFilter(
  catalogId: Option[String],
  catalogType: CatalogsHotelItemsFilter.CatalogType.Value,
  hotelIds: List[String]
)

object CatalogsHotelItemsFilter {
  implicit lazy val catalogsHotelItemsFilterJsonFormat: Format[CatalogsHotelItemsFilter] = Json.format[CatalogsHotelItemsFilter]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val HOTEL = Value("HOTEL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

