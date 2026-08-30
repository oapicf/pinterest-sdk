package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupUint32Criteria.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsProductGroupUint32Criteria(
  negated: Option[Boolean],
  operator: NumericFilterOperatorType,
  value: Int
)

object CatalogsProductGroupUint32Criteria {
  implicit lazy val catalogsProductGroupUint32CriteriaJsonFormat: Format[CatalogsProductGroupUint32Criteria] = Json.format[CatalogsProductGroupUint32Criteria]
}

