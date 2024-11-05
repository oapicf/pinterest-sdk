package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsVerticalProductGroup.
  * @param id ID of the creative assets product group.
  * @param name Name of creative assets product group
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  * @param createdAt Unix timestamp in seconds of when catalog product group was created.
  * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated.
  * @param catalogId Catalog id pertaining to the creative assets product group.
  * @param feedId id of the catalogs feed belonging to this catalog product group
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsVerticalProductGroup(
  catalogType: CatalogsVerticalProductGroup.CatalogType.Value,
  id: String,
  name: Option[String],
  description: Option[String],
  filters: CatalogsCreativeAssetsProductGroupFilters,
  isFeatured: Option[Boolean],
  `type`: Option[CatalogsProductGroupType],
  status: Option[CatalogsProductGroupStatus],
  createdAt: Option[Int],
  updatedAt: Option[Int],
  catalogId: String,
  feedId: String,
  country: Option[String],
  locale: Option[String]
  additionalProperties: 
)

object CatalogsVerticalProductGroup {
  implicit lazy val catalogsVerticalProductGroupJsonFormat: Format[CatalogsVerticalProductGroup] = {
    val realJsonFormat = Json.format[CatalogsVerticalProductGroup]
    val declaredPropNames = Set("catalogType", "id", "name", "description", "filters", "isFeatured", "`type`", "status", "createdAt", "updatedAt", "catalogId", "feedId", "country", "locale")
    
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
      Writes { catalogsVerticalProductGroup =>
        val jsObj = realJsonFormat.writes(catalogsVerticalProductGroup)
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

