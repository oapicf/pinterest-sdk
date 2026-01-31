package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsRetailProduct.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsRetailProduct(
  catalogType: CatalogsRetailProduct.CatalogType.Value,
  metadata: CatalogsRetailProductMetadata,
  pin: Pin
)

object CatalogsRetailProduct {
  implicit lazy val catalogsRetailProductJsonFormat: Format[CatalogsRetailProduct] = Json.format[CatalogsRetailProduct]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val RETAIL = Value("RETAIL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

