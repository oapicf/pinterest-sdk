package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupFiltersAllOf.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class CatalogsProductGroupFiltersAllOf(
  allOf: Option[List[CatalogsProductGroupFilterKeys]]
  additionalProperties: 
)

object CatalogsProductGroupFiltersAllOf {
  implicit lazy val catalogsProductGroupFiltersAllOfJsonFormat: Format[CatalogsProductGroupFiltersAllOf] = {
    val realJsonFormat = Json.format[CatalogsProductGroupFiltersAllOf]
    val declaredPropNames = Set("allOf")
    
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
      Writes { catalogsProductGroupFiltersAllOf =>
        val jsObj = realJsonFormat.writes(catalogsProductGroupFiltersAllOf)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

