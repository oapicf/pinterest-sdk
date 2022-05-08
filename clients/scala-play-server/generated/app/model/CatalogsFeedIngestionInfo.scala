package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsFeedIngestionInfo.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class CatalogsFeedIngestionInfo(
  inStock: Option[Int],
  outOfStock: Option[Int],
  preorder: Option[Int]
  additionalProperties: 
)

object CatalogsFeedIngestionInfo {
  implicit lazy val catalogsFeedIngestionInfoJsonFormat: Format[CatalogsFeedIngestionInfo] = {
    val realJsonFormat = Json.format[CatalogsFeedIngestionInfo]
    val declaredPropNames = Set("inStock", "outOfStock", "preorder")
    
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
      Writes { catalogsFeedIngestionInfo =>
        val jsObj = realJsonFormat.writes(catalogsFeedIngestionInfo)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

