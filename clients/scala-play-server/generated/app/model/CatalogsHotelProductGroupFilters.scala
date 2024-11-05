package model

import play.api.libs.json._

/**
  * Object holding a group of filters for a hotel product group
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsHotelProductGroupFilters(
  anyOf: List[CatalogsHotelProductGroupFilterKeys],
  allOf: List[CatalogsHotelProductGroupFilterKeys]
  additionalProperties: 
)

object CatalogsHotelProductGroupFilters {
  implicit lazy val catalogsHotelProductGroupFiltersJsonFormat: Format[CatalogsHotelProductGroupFilters] = {
    val realJsonFormat = Json.format[CatalogsHotelProductGroupFilters]
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
      Writes { catalogsHotelProductGroupFilters =>
        val jsObj = realJsonFormat.writes(catalogsHotelProductGroupFilters)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

