package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsItemsPostFilters.
  * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsItemsPostFilters(
  catalogId: Option[String],
  catalogType: CatalogsItemsPostFilters.CatalogType.Value,
  itemIds: List[String],
  hotelIds: List[String],
  creativeAssetsIds: List[String]
  additionalProperties: 
)

object CatalogsItemsPostFilters {
  implicit lazy val catalogsItemsPostFiltersJsonFormat: Format[CatalogsItemsPostFilters] = {
    val realJsonFormat = Json.format[CatalogsItemsPostFilters]
    val declaredPropNames = Set("catalogId", "catalogType", "itemIds", "hotelIds", "creativeAssetsIds")
    
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
      Writes { catalogsItemsPostFilters =>
        val jsObj = realJsonFormat.writes(catalogsItemsPostFilters)
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

