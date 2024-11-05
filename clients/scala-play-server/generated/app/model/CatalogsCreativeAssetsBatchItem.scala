package model

import play.api.libs.json._

/**
  * Creative assets batch item
  * @param creativeAssetsId The catalog creative assets id in the merchant namespace
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsCreativeAssetsBatchItem(
  creativeAssetsId: String,
  operation: CatalogsCreativeAssetsBatchItem.Operation.Value,
  attributes: CatalogsUpdatableCreativeAssetsAttributes
  additionalProperties: 
)

object CatalogsCreativeAssetsBatchItem {
  implicit lazy val catalogsCreativeAssetsBatchItemJsonFormat: Format[CatalogsCreativeAssetsBatchItem] = {
    val realJsonFormat = Json.format[CatalogsCreativeAssetsBatchItem]
    val declaredPropNames = Set("creativeAssetsId", "operation", "attributes")
    
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
      Writes { catalogsCreativeAssetsBatchItem =>
        val jsObj = realJsonFormat.writes(catalogsCreativeAssetsBatchItem)
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

