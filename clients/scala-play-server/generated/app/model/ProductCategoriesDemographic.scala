package model

import play.api.libs.json._

/**
  * Age and gender distribution who engaged with this product category in the past 3 months
  * @param age Age demographic distribution
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ProductCategoriesDemographic(
  age: Map[String, BigDecimal],
  gender: GenderDemographics
)

object ProductCategoriesDemographic {
  implicit lazy val productCategoriesDemographicJsonFormat: Format[ProductCategoriesDemographic] = Json.format[ProductCategoriesDemographic]
}

