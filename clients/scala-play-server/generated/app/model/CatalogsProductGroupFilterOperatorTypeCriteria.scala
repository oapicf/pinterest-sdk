package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupFilterOperatorTypeCriteria.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsProductGroupFilterOperatorTypeCriteria(
  filterOperatorType: Option[FilterOperatorType],
  negated: Option[Boolean],
  values: List[String]
)

object CatalogsProductGroupFilterOperatorTypeCriteria {
  implicit lazy val catalogsProductGroupFilterOperatorTypeCriteriaJsonFormat: Format[CatalogsProductGroupFilterOperatorTypeCriteria] = Json.format[CatalogsProductGroupFilterOperatorTypeCriteria]
}

