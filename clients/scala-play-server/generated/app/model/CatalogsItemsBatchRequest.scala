package model

import play.api.libs.json._

/**
  * Request object of catalogs items batch
  * @param items Array with catalogs items
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
case class CatalogsItemsBatchRequest(
  country: Option[Country],
  language: Option[Language],
  operation: Option[BatchOperation],
  items: Option[List[ItemBatchRecord]]
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

