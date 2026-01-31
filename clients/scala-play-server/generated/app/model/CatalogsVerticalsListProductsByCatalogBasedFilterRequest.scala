package model

import play.api.libs.json._

/**
  * Request object to list products for a given catalog_id and product group filter.
  * @param catalogId Catalog id pertaining to the creative assets product group.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsVerticalsListProductsByCatalogBasedFilterRequest(
  catalogId: String,
  catalogType: CatalogsVerticalsListProductsByCatalogBasedFilterRequest.CatalogType.Value,
  country: Country,
  filters: CatalogsCreativeAssetsProductGroupFilters,
  locale: CatalogsLocale
  additionalProperties: 
)

object CatalogsVerticalsListProductsByCatalogBasedFilterRequest {
  implicit lazy val catalogsVerticalsListProductsByCatalogBasedFilterRequestJsonFormat: Format[CatalogsVerticalsListProductsByCatalogBasedFilterRequest] = {
    val realJsonFormat = Json.format[CatalogsVerticalsListProductsByCatalogBasedFilterRequest]
    val declaredPropNames = Set("catalogId", "catalogType", "country", "filters", "locale")
    
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
      Writes { catalogsVerticalsListProductsByCatalogBasedFilterRequest =>
        val jsObj = realJsonFormat.writes(catalogsVerticalsListProductsByCatalogBasedFilterRequest)
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

