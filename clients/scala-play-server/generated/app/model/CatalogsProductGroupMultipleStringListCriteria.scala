package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupMultipleStringListCriteria.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsProductGroupMultipleStringListCriteria(
  values: List[List[String]],
  negated: Option[Boolean]
)

object CatalogsProductGroupMultipleStringListCriteria {
  implicit lazy val catalogsProductGroupMultipleStringListCriteriaJsonFormat: Format[CatalogsProductGroupMultipleStringListCriteria] = Json.format[CatalogsProductGroupMultipleStringListCriteria]
}

