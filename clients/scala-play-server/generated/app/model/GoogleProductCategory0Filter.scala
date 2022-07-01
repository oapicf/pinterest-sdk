package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GoogleProductCategory0Filter.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class GoogleProductCategory0Filter(
  GOOGLE_PRODUCT_CATEGORY_0: CatalogsProductGroupMultipleStringListCriteria
  additionalProperties: 
)

object GoogleProductCategory0Filter {
  implicit lazy val googleProductCategory0FilterJsonFormat: Format[GoogleProductCategory0Filter] = {
    val realJsonFormat = Json.format[GoogleProductCategory0Filter]
    val declaredPropNames = Set("GOOGLE_PRODUCT_CATEGORY_0")
    
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
      Writes { googleProductCategory0Filter =>
        val jsObj = realJsonFormat.writes(googleProductCategory0Filter)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

