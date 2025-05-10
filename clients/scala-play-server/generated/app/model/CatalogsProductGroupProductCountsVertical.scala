package model

import play.api.libs.json._

/**
  * Product counts for a CatalogsProductGroup
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsProductGroupProductCountsVertical(
  catalogType: CatalogsType,
  inStock: BigDecimal,
  outOfStock: BigDecimal,
  preorder: BigDecimal,
  total: BigDecimal,
  videos: BigDecimal
)

object CatalogsProductGroupProductCountsVertical {
  implicit lazy val catalogsProductGroupProductCountsVerticalJsonFormat: Format[CatalogsProductGroupProductCountsVertical] = Json.format[CatalogsProductGroupProductCountsVertical]
}

