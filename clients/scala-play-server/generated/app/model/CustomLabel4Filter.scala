package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomLabel4Filter.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class CustomLabel4Filter(
  CUSTOM_LABEL_4: CatalogsProductGroupMultipleStringCriteria
  additionalProperties: 
)

object CustomLabel4Filter {
  implicit lazy val customLabel4FilterJsonFormat: Format[CustomLabel4Filter] = {
    val realJsonFormat = Json.format[CustomLabel4Filter]
    val declaredPropNames = Set("CUSTOM_LABEL_4")
    
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
      Writes { customLabel4Filter =>
        val jsObj = realJsonFormat.writes(customLabel4Filter)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

