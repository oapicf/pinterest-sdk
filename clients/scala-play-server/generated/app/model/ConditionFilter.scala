package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConditionFilter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ConditionFilter(
  CONDITION: CatalogsProductGroupMultipleStringCriteria
)

object ConditionFilter {
  implicit lazy val conditionFilterJsonFormat: Format[ConditionFilter] = Json.format[ConditionFilter]
}

