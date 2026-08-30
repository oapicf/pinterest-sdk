package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsCreativeAssetsProduct.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsCreativeAssetsProduct(
  catalogType: CatalogsCreativeAssetsProduct.CatalogType.Value,
  metadata: CatalogsCreativeAssetsProductMetadata,
  pin: Pin
)

object CatalogsCreativeAssetsProduct {
  implicit lazy val catalogsCreativeAssetsProductJsonFormat: Format[CatalogsCreativeAssetsProduct] = Json.format[CatalogsCreativeAssetsProduct]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

