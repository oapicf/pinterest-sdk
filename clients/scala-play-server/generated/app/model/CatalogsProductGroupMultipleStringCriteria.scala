package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupMultipleStringCriteria.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
case class CatalogsProductGroupMultipleStringCriteria(
  values: List[String],
  negated: Boolean
  additionalProperties: 
)

object CatalogsProductGroupMultipleStringCriteria {
  implicit lazy val catalogsProductGroupMultipleStringCriteriaJsonFormat: Format[CatalogsProductGroupMultipleStringCriteria] = {
    val realJsonFormat = Json.format[CatalogsProductGroupMultipleStringCriteria]
    val declaredPropNames = Set("values", "negated")
    
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
      Writes { catalogsProductGroupMultipleStringCriteria =>
        val jsObj = realJsonFormat.writes(catalogsProductGroupMultipleStringCriteria)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

