package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LocalInventoryOperation.
  * @param itemId Catalog item id in the merchant namespace
  * @param storeCode Store code for the local inventory item
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LocalInventoryOperation(
  attributes: RetailLocalInventoryItemAttributes,
  itemId: String,
  operation: LocalInventoryOperation.Operation.Value,
  storeCode: String
  additionalProperties: 
)

object LocalInventoryOperation {
  implicit lazy val localInventoryOperationJsonFormat: Format[LocalInventoryOperation] = {
    val realJsonFormat = Json.format[LocalInventoryOperation]
    val declaredPropNames = Set("attributes", "itemId", "operation", "storeCode")
    
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
      Writes { localInventoryOperation =>
        val jsObj = realJsonFormat.writes(localInventoryOperation)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val DELETE = Value("DELETE")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

