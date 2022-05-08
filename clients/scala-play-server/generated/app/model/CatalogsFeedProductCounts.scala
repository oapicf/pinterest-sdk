package model

import play.api.libs.json._

/**
  * The counts can be null early in the process.
  * @param original The number of products in the feed file
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class CatalogsFeedProductCounts(
  original: Option[Int]
  additionalProperties: 
)

object CatalogsFeedProductCounts {
  implicit lazy val catalogsFeedProductCountsJsonFormat: Format[CatalogsFeedProductCounts] = {
    val realJsonFormat = Json.format[CatalogsFeedProductCounts]
    val declaredPropNames = Set("original")
    
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
      Writes { catalogsFeedProductCounts =>
        val jsObj = realJsonFormat.writes(catalogsFeedProductCounts)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

