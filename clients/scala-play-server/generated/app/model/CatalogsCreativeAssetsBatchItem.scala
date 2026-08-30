package model

import play.api.libs.json._

/**
  * Creative assets batch item
  * @param creativeAssetsId The catalog creative assets id in the merchant namespace
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsCreativeAssetsBatchItem(
  attributes: CatalogsUpdatableCreativeAssetsAttributes,
  creativeAssetsId: String,
  operation: CatalogsCreativeAssetsBatchItem.Operation.Value
  additionalProperties: 
)

object CatalogsCreativeAssetsBatchItem {
  implicit lazy val catalogsCreativeAssetsBatchItemJsonFormat: Format[CatalogsCreativeAssetsBatchItem] = {
    val realJsonFormat = Json.format[CatalogsCreativeAssetsBatchItem]
    val declaredPropNames = Set("attributes", "creativeAssetsId", "operation")
    
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

