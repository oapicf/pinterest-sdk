package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingSpecOperations.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TargetingSpecOperations(
  field: TargetingSpecOperations.Field.Value,
  operation: TargetingSpecOperations.Operation.Value,
  values: List[TargetingSpecShoppingRetargeting],
  value: String
  additionalProperties: 
)

object TargetingSpecOperations {
  implicit lazy val targetingSpecOperationsJsonFormat: Format[TargetingSpecOperations] = {
    val realJsonFormat = Json.format[TargetingSpecOperations]
    val declaredPropNames = Set("field", "operation", "values", "value")
    
    Format(
      Reads {
        case JsObject(xs) =>
          val declaredProps = xs.filterKeys(declaredPropNames)
          val additionalProps = JsObject(xs -- declaredPropNames)
          val restructuredProps = declaredProps + ("additionalProperties" -> additionalProps)
          val newObj = JsObject(restructuredProps)
          realJsonFormat.reads(newObj)
        case _ =>
          JsError("error.expected.jsobject")
      },
      Writes { targetingSpecOperations =>
        val jsObj = realJsonFormat.writes(targetingSpecOperations)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object Field extends Enumeration {
    val MINIMUMAGE = Value("MINIMUM_AGE")

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

