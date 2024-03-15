package model

import play.api.libs.json._

/**
  * Product counts for a CatalogsProductGroup
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsProductGroupProductCounts(
  inStock: BigDecimal,
  outOfStock: BigDecimal,
  preorder: BigDecimal,
  total: BigDecimal
)

object CatalogsProductGroupProductCounts {
  implicit lazy val catalogsProductGroupProductCountsJsonFormat: Format[CatalogsProductGroupProductCounts] = Json.format[CatalogsProductGroupProductCounts]
}

