package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomLabel2Filter.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
case class CustomLabel2Filter(
  CUSTOM_LABEL_2: CatalogsProductGroupMultipleStringCriteria
  additionalProperties: 
)

object CustomLabel2Filter {
  implicit lazy val customLabel2FilterJsonFormat: Format[CustomLabel2Filter] = {
    val realJsonFormat = Json.format[CustomLabel2Filter]
    val declaredPropNames = Set("CUSTOM_LABEL_2")
    
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
      Writes { customLabel2Filter =>
        val jsObj = realJsonFormat.writes(customLabel2Filter)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

