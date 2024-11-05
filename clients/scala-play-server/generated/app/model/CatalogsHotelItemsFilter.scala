package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsHotelItemsFilter.
  * @param catalogId Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsHotelItemsFilter(
  catalogType: CatalogsHotelItemsFilter.CatalogType.Value,
  hotelIds: List[String],
  catalogId: Option[String]
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

