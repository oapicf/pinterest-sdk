package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupUint32Criteria.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsProductGroupUint32Criteria(
  negated: Option[Boolean],
  operator: NumericFilterOperatorType,
  value: Int
)

object CatalogsProductGroupUint32Criteria {
  implicit lazy val catalogsProductGroupUint32CriteriaJsonFormat: Format[CatalogsProductGroupUint32Criteria] = Json.format[CatalogsProductGroupUint32Criteria]
}

