package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingSpecOperationList.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TargetingSpecOperationList(
  field: String,
  operation: TargetingSpecOperationList.Operation.Value,
  values: List[String]
)

object TargetingSpecOperationList {
  implicit lazy val targetingSpecOperationListJsonFormat: Format[TargetingSpecOperationList] = Json.format[TargetingSpecOperationList]

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val SET = Value("SET")
    val ADD = Value("ADD")
    val REMOVE = Value("REMOVE")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

