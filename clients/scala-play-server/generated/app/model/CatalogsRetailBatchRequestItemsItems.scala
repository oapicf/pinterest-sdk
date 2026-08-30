package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsRetailBatchRequestItemsItems.
  * @param itemId The catalog item id in the merchant namespace
  * @param updateMask The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
  * @param lastUpdatedTime The millisecond timestamp when the item was lastly modified by the merchant.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsRetailBatchRequestItemsItems(
  attributes: ItemAttributesRequest,
  itemId: String,
  operation: CatalogsRetailBatchRequestItemsItems.Operation.Value,
  updateMask: Option[List[UpdateMaskFieldType]],
  lastUpdatedTime: Option[Long]
  additionalProperties: 
)

object CatalogsRetailBatchRequestItemsItems {
  implicit lazy val catalogsRetailBatchRequestItemsItemsJsonFormat: Format[CatalogsRetailBatchRequestItemsItems] = {
    val realJsonFormat = Json.format[CatalogsRetailBatchRequestItemsItems]
    val declaredPropNames = Set("attributes", "itemId", "operation", "updateMask", "lastUpdatedTime")
    
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
      Writes { catalogsRetailBatchRequestItemsItems =>
        val jsObj = realJsonFormat.writes(catalogsRetailBatchRequestItemsItems)
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

