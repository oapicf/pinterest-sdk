package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupUint32Criteria.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsProductGroupUint32Criteria(
  negated: Option[Boolean],
  operator: CatalogsProductGroupUint32Criteria.Operator.Value,
  value: Int
)

object CatalogsProductGroupUint32Criteria {
  implicit lazy val catalogsProductGroupUint32CriteriaJsonFormat: Format[CatalogsProductGroupUint32Criteria] = Json.format[CatalogsProductGroupUint32Criteria]

  // noinspection TypeAnnotation
  object Operator extends Enumeration {
    val GREATERTHAN = Value("GREATER_THAN")
    val GREATERTHANOREQUALS = Value("GREATER_THAN_OR_EQUALS")
    val LESSTHAN = Value("LESS_THAN")
    val LESSTHANOREQUALS = Value("LESS_THAN_OR_EQUALS")

    type Operator = Value
    implicit lazy val OperatorJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

