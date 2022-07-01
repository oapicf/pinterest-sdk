package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GenderFilter.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class GenderFilter(
  GENDER: CatalogsProductGroupMultipleStringCriteria
  additionalProperties: 
)

object GenderFilter {
  implicit lazy val genderFilterJsonFormat: Format[GenderFilter] = {
    val realJsonFormat = Json.format[GenderFilter]
    val declaredPropNames = Set("GENDER")
    
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
      Writes { genderFilter =>
        val jsObj = realJsonFormat.writes(genderFilter)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

