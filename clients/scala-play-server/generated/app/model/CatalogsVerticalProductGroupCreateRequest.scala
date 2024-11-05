package model

import play.api.libs.json._

/**
  * Request object for creating a catalog based product group.
  * @param catalogId Catalog id pertaining to the creative assets product group.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsVerticalProductGroupCreateRequest(
  catalogType: CatalogsVerticalProductGroupCreateRequest.CatalogType.Value,
  name: String,
  description: Option[String],
  filters: CatalogsCreativeAssetsProductGroupFilters,
  catalogId: String,
  country: Country,
  locale: CatalogsLocale
  additionalProperties: 
)

object CatalogsVerticalProductGroupCreateRequest {
  implicit lazy val catalogsVerticalProductGroupCreateRequestJsonFormat: Format[CatalogsVerticalProductGroupCreateRequest] = {
    val realJsonFormat = Json.format[CatalogsVerticalProductGroupCreateRequest]
    val declaredPropNames = Set("catalogType", "name", "description", "filters", "catalogId", "country", "locale")
    
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
      Writes { catalogsVerticalProductGroupCreateRequest =>
        val jsObj = realJsonFormat.writes(catalogsVerticalProductGroupCreateRequest)
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

