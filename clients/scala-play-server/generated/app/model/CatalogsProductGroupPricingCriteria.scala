package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupPricingCriteria.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsProductGroupPricingCriteria(
  inclusion: Option[Boolean],
  negated: Option[Boolean],
  values: BigDecimal
)

object CatalogsProductGroupPricingCriteria {
  implicit lazy val catalogsProductGroupPricingCriteriaJsonFormat: Format[CatalogsProductGroupPricingCriteria] = Json.format[CatalogsProductGroupPricingCriteria]
}

