package model

import play.api.libs.json._

/**
  * Product counts for a Creative Assets CatalogsProductGroup
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsCreativeAssetsProductGroupProductCounts(
  appLinks: BigDecimal,
  catalogType: CatalogsCreativeAssetsProductGroupProductCounts.CatalogType.Value,
  images: BigDecimal,
  total: BigDecimal,
  videos: BigDecimal
)

object CatalogsCreativeAssetsProductGroupProductCounts {
  implicit lazy val catalogsCreativeAssetsProductGroupProductCountsJsonFormat: Format[CatalogsCreativeAssetsProductGroupProductCounts] = Json.format[CatalogsCreativeAssetsProductGroupProductCounts]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

