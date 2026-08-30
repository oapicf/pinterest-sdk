package model

import play.api.libs.json._

/**
  * Object holding available filter values for each filter key
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsAvailableFilterValues(
  catalogType: CatalogsAvailableFilterValues.CatalogType.Value,
  filterValues: CatalogsCreativeAssetsFilterValuesMap
  additionalProperties: 
)

object CatalogsAvailableFilterValues {
  implicit lazy val catalogsAvailableFilterValuesJsonFormat: Format[CatalogsAvailableFilterValues] = {
    val realJsonFormat = Json.format[CatalogsAvailableFilterValues]
    val declaredPropNames = Set("catalogType", "filterValues")
    
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
      Writes { catalogsAvailableFilterValues =>
        val jsObj = realJsonFormat.writes(catalogsAvailableFilterValues)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

