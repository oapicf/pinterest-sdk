package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GoogleProductCategory6Filter.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class GoogleProductCategory6Filter(
  GOOGLE_PRODUCT_CATEGORY_6: CatalogsProductGroupMultipleStringListCriteria
  additionalProperties: 
)

object GoogleProductCategory6Filter {
  implicit lazy val googleProductCategory6FilterJsonFormat: Format[GoogleProductCategory6Filter] = {
    val realJsonFormat = Json.format[GoogleProductCategory6Filter]
    val declaredPropNames = Set("GOOGLE_PRODUCT_CATEGORY_6")
    
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
      Writes { googleProductCategory6Filter =>
        val jsObj = realJsonFormat.writes(googleProductCategory6Filter)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

