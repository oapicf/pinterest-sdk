package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupFilterOperatorTypeCriteria.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsProductGroupFilterOperatorTypeCriteria(
  filterOperatorType: Option[CatalogsProductGroupFilterOperatorTypeCriteria.FilterOperatorType.Value],
  negated: Option[Boolean],
  values: List[String]
)

object CatalogsProductGroupFilterOperatorTypeCriteria {
  implicit lazy val catalogsProductGroupFilterOperatorTypeCriteriaJsonFormat: Format[CatalogsProductGroupFilterOperatorTypeCriteria] = Json.format[CatalogsProductGroupFilterOperatorTypeCriteria]

  // noinspection TypeAnnotation
  object FilterOperatorType extends Enumeration {
    val IS = Value("IS")
    val CONTAINS = Value("CONTAINS")

    type FilterOperatorType = Value
    implicit lazy val FilterOperatorTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

