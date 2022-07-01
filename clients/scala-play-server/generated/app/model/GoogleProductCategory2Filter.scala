package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GoogleProductCategory2Filter.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class GoogleProductCategory2Filter(
  GOOGLE_PRODUCT_CATEGORY_2: CatalogsProductGroupMultipleStringListCriteria
  additionalProperties: 
)

object GoogleProductCategory2Filter {
  implicit lazy val googleProductCategory2FilterJsonFormat: Format[GoogleProductCategory2Filter] = {
    val realJsonFormat = Json.format[GoogleProductCategory2Filter]
    val declaredPropNames = Set("GOOGLE_PRODUCT_CATEGORY_2")
    
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
      Writes { googleProductCategory2Filter =>
        val jsObj = realJsonFormat.writes(googleProductCategory2Filter)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

