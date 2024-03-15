package model

import play.api.libs.json._

/**
  * Request object of catalogs items batch
  * @param items Array with catalogs items
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsItemsBatchRequest(
  country: Country,
  language: Language,
  operation: BatchOperation,
  items: List[ItemDeleteBatchRecord]
  additionalProperties: 
)

object CatalogsItemsBatchRequest {
  implicit lazy val catalogsItemsBatchRequestJsonFormat: Format[CatalogsItemsBatchRequest] = {
    val realJsonFormat = Json.format[CatalogsItemsBatchRequest]
    val declaredPropNames = Set("country", "language", "operation", "items")
    
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
      Writes { catalogsItemsBatchRequest =>
        val jsObj = realJsonFormat.writes(catalogsItemsBatchRequest)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

