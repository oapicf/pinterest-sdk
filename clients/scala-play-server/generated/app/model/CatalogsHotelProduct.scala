package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsHotelProduct.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsHotelProduct(
  catalogType: CatalogsHotelProduct.CatalogType.Value,
  metadata: CatalogsHotelProductMetadata,
  pin: Pin
)

object CatalogsHotelProduct {
  implicit lazy val catalogsHotelProductJsonFormat: Format[CatalogsHotelProduct] = Json.format[CatalogsHotelProduct]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val HOTEL = Value("HOTEL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

