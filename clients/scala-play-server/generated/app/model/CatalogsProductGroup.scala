package model

import play.api.libs.json._

/**
  * catalog product group entity
  * @param id ID of the catalog product group.
  * @param name Name of catalog product group
  * @param feedId id of the catalogs feed belonging to this catalog product group
  * @param createdAt Unix timestamp in seconds of when catalog product group was created.
  * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class CatalogsProductGroup(
  id: String,
  name: Option[String],
  description: Option[String],
  filters: CatalogsProductGroupFilters,
  `type`: Option[CatalogsProductGroupType],
  status: Option[CatalogsProductGroupStatus],
  feedId: Option[String],
  createdAt: Option[Int],
  updatedAt: Option[Int]
  additionalProperties: 
)

object CatalogsProductGroup {
  implicit lazy val catalogsProductGroupJsonFormat: Format[CatalogsProductGroup] = {
    val realJsonFormat = Json.format[CatalogsProductGroup]
    val declaredPropNames = Set("id", "name", "description", "filters", "`type`", "status", "feedId", "createdAt", "updatedAt")
    
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
      Writes { catalogsProductGroup =>
        val jsObj = realJsonFormat.writes(catalogsProductGroup)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

