package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsRetailProduct.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

