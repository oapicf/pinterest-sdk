package model

import play.api.libs.json._

/**
  * Product counts for a Hotel CatalogsProductGroup
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsHotelProductGroupProductCounts(
  catalogType: CatalogsHotelProductGroupProductCounts.CatalogType.Value,
  total: BigDecimal
)

object CatalogsHotelProductGroupProductCounts {
  implicit lazy val catalogsHotelProductGroupProductCountsJsonFormat: Format[CatalogsHotelProductGroupProductCounts] = Json.format[CatalogsHotelProductGroupProductCounts]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val HOTEL = Value("HOTEL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

