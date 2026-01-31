package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupMultipleStringListCriteria.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsProductGroupMultipleStringListCriteria(
  negated: Option[Boolean],
  values: List[List[String]]
)

object CatalogsProductGroupMultipleStringListCriteria {
  implicit lazy val catalogsProductGroupMultipleStringListCriteriaJsonFormat: Format[CatalogsProductGroupMultipleStringListCriteria] = Json.format[CatalogsProductGroupMultipleStringListCriteria]
}

