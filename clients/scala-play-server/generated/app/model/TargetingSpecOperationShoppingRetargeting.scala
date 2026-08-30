package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingSpecOperationShoppingRetargeting.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TargetingSpecOperationShoppingRetargeting(
  field: TargetingSpecOperationShoppingRetargeting.Field.Value,
  operation: TargetingSpecOperationShoppingRetargeting.Operation.Value,
  values: List[TargetingSpecShoppingRetargeting]
)

object TargetingSpecOperationShoppingRetargeting {
  implicit lazy val targetingSpecOperationShoppingRetargetingJsonFormat: Format[TargetingSpecOperationShoppingRetargeting] = Json.format[TargetingSpecOperationShoppingRetargeting]

  // noinspection TypeAnnotation
  object Field extends Enumeration {
    val SHOPPINGRETARGETING = Value("SHOPPING_RETARGETING")

    type Field = Value
    implicit lazy val FieldJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val SET = Value("SET")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

