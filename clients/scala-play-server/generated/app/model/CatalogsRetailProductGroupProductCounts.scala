package model

import play.api.libs.json._

/**
  * Product counts for a Retail CatalogsProductGroup
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsRetailProductGroupProductCounts(
  catalogType: CatalogsRetailProductGroupProductCounts.CatalogType.Value,
  inStock: BigDecimal,
  outOfStock: BigDecimal,
  preorder: BigDecimal,
  total: BigDecimal,
  videos: Option[BigDecimal]
)

object CatalogsRetailProductGroupProductCounts {
  implicit lazy val catalogsRetailProductGroupProductCountsJsonFormat: Format[CatalogsRetailProductGroupProductCounts] = Json.format[CatalogsRetailProductGroupProductCounts]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val RETAIL = Value("RETAIL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

