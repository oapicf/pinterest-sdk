package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsVerticalProductGroup.
  * @param id ID of the catalog product group.
  * @param name Name of catalog product group
  * @param createdAt Unix timestamp in seconds of when catalog product group was created.
  * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated.
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsVerticalProductGroup(
  catalogType: CatalogsVerticalProductGroup.CatalogType.Value,
  id: String,
  name: Option[String],
  description: Option[String],
  filters: CatalogsProductGroupFilters,
  createdAt: Option[Int],
  updatedAt: Option[Int],
  catalogId: String,
  isFeatured: Option[Boolean],
  `type`: Option[CatalogsProductGroupType],
  status: Option[CatalogsProductGroupStatus],
  feedId: CatalogsVerticalProductGroup.FeedId.Value
  additionalProperties: 
)

object CatalogsVerticalProductGroup {
  implicit lazy val catalogsVerticalProductGroupJsonFormat: Format[CatalogsVerticalProductGroup] = {
    val realJsonFormat = Json.format[CatalogsVerticalProductGroup]
    val declaredPropNames = Set("catalogType", "id", "name", "description", "filters", "createdAt", "updatedAt", "catalogId", "isFeatured", "`type`", "status", "feedId")
    
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
    val RETAIL = Value("RETAIL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object FeedId extends Enumeration {
    val Null = Value("null")

    type FeedId = Value
    implicit lazy val FeedIdJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

