package model

import play.api.libs.json._

/**
  * Product counts for a CatalogsProductGroup
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

