package model

import play.api.libs.json._

/**
  * Request object for updating a catalog based product group.
  * @param name Name of catalog product group
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsVerticalProductGroupUpdateRequest(
  catalogType: Option[CatalogsVerticalProductGroupUpdateRequest.CatalogType.Value],
  country: Option[Country],
  description: Option[String],
  filters: Option[CatalogsCreativeAssetsProductGroupFilters],
  locale: Option[CatalogsLocale],
  name: Option[String]
  additionalProperties: 
)

object CatalogsVerticalProductGroupUpdateRequest {
  implicit lazy val catalogsVerticalProductGroupUpdateRequestJsonFormat: Format[CatalogsVerticalProductGroupUpdateRequest] = {
    val realJsonFormat = Json.format[CatalogsVerticalProductGroupUpdateRequest]
    val declaredPropNames = Set("catalogType", "country", "description", "filters", "locale", "name")
    
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
      Writes { catalogsVerticalProductGroupUpdateRequest =>
        val jsObj = realJsonFormat.writes(catalogsVerticalProductGroupUpdateRequest)
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

