package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupMultipleStringListCriteria.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class CatalogsProductGroupMultipleStringListCriteria(
  values: List[List[String]],
  negated: Boolean
  additionalProperties: 
)

object CatalogsProductGroupMultipleStringListCriteria {
  implicit lazy val catalogsProductGroupMultipleStringListCriteriaJsonFormat: Format[CatalogsProductGroupMultipleStringListCriteria] = {
    val realJsonFormat = Json.format[CatalogsProductGroupMultipleStringListCriteria]
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
      Writes { catalogsProductGroupMultipleStringListCriteria =>
        val jsObj = realJsonFormat.writes(catalogsProductGroupMultipleStringListCriteria)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

