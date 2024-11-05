package model

import play.api.libs.json._

/**
  * Product counts for a Creative Assets CatalogsProductGroup
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsCreativeAssetsProductGroupProductCounts(
  catalogType: CatalogsCreativeAssetsProductGroupProductCounts.CatalogType.Value,
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

