package model

import play.api.libs.json._

/**
  * Object holding a group of filters for a catalog product group
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class CatalogsProductGroupFilters(
  anyOf: Option[List[CatalogsProductGroupFilterKeys]],
  allOf: Option[List[CatalogsProductGroupFilterKeys]]
  additionalProperties: 
)

object CatalogsProductGroupFilters {
  implicit lazy val catalogsProductGroupFiltersJsonFormat: Format[CatalogsProductGroupFilters] = {
    val realJsonFormat = Json.format[CatalogsProductGroupFilters]
    val declaredPropNames = Set("anyOf", "allOf")
    
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
      Writes { catalogsProductGroupFilters =>
        val jsObj = realJsonFormat.writes(catalogsProductGroupFilters)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

