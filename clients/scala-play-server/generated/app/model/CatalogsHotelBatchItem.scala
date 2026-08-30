package model

import play.api.libs.json._

/**
  * Hotel batch item
  * @param hotelId The catalog hotel id in the merchant namespace
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsHotelBatchItem(
  attributes: CatalogsUpdatableHotelAttributes,
  hotelId: String,
  operation: CatalogsHotelBatchItem.Operation.Value
  additionalProperties: 
)

object CatalogsHotelBatchItem {
  implicit lazy val catalogsHotelBatchItemJsonFormat: Format[CatalogsHotelBatchItem] = {
    val realJsonFormat = Json.format[CatalogsHotelBatchItem]
    val declaredPropNames = Set("attributes", "hotelId", "operation")
    
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
      Writes { catalogsHotelBatchItem =>
        val jsObj = realJsonFormat.writes(catalogsHotelBatchItem)
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

