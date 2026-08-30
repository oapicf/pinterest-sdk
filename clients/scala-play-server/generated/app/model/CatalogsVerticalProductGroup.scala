package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsVerticalProductGroup.
  * @param catalogId Catalog ID pertaining to the product group.
  * @param createdAt Unix timestamp in seconds of when catalog product group was created.
  * @param feedId id of the catalogs feed belonging to this catalog product group
  * @param id ID of the catalog product group.
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  * @param name Name of catalog product group
  * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsVerticalProductGroup(
  catalogId: String,
  catalogType: CatalogsVerticalProductGroup.CatalogType.Value,
  country: Option[String],
  createdAt: Option[Int],
  description: Option[String],
  feedId: String,
  filters: CatalogsCreativeAssetsProductGroupFilters,
  id: String,
  isFeatured: Option[Boolean],
  locale: Option[String],
  name: Option[String],
  status: Option[CatalogsProductGroupStatus],
  `type`: CatalogsHotelProductGroupType,
  updatedAt: Option[Int]
  additionalProperties: 
)

object CatalogsVerticalProductGroup {
  implicit lazy val catalogsVerticalProductGroupJsonFormat: Format[CatalogsVerticalProductGroup] = {
    val realJsonFormat = Json.format[CatalogsVerticalProductGroup]
    val declaredPropNames = Set("catalogId", "catalogType", "country", "createdAt", "description", "feedId", "filters", "id", "isFeatured", "locale", "name", "status", "`type`", "updatedAt")
    
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

