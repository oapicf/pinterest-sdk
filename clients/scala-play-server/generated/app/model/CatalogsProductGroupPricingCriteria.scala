package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupPricingCriteria.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsProductGroupPricingCriteria(
  inclusion: Option[Boolean],
  values: BigDecimal,
  negated: Option[Boolean]
)

object CatalogsProductGroupPricingCriteria {
  implicit lazy val catalogsProductGroupPricingCriteriaJsonFormat: Format[CatalogsProductGroupPricingCriteria] = Json.format[CatalogsProductGroupPricingCriteria]
}

