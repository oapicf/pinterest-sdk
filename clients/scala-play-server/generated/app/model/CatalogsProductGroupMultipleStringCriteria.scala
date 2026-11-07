package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupMultipleStringCriteria.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsProductGroupMultipleStringCriteria(
  negated: Option[Boolean],
  values: List[String]
)

object CatalogsProductGroupMultipleStringCriteria {
  implicit lazy val catalogsProductGroupMultipleStringCriteriaJsonFormat: Format[CatalogsProductGroupMultipleStringCriteria] = Json.format[CatalogsProductGroupMultipleStringCriteria]
}

