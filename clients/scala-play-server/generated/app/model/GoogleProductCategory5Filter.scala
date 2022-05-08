package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GoogleProductCategory5Filter.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class GoogleProductCategory5Filter(
  GOOGLE_PRODUCT_CATEGORY_5: CatalogsProductGroupMultipleStringListCriteria
  additionalProperties: 
)

object GoogleProductCategory5Filter {
  implicit lazy val googleProductCategory5FilterJsonFormat: Format[GoogleProductCategory5Filter] = {
    val realJsonFormat = Json.format[GoogleProductCategory5Filter]
    val declaredPropNames = Set("GOOGLE_PRODUCT_CATEGORY_5")
    
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
      Writes { googleProductCategory5Filter =>
        val jsObj = realJsonFormat.writes(googleProductCategory5Filter)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

