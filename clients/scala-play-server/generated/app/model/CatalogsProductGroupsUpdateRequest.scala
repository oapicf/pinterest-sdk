package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for catalogs_product_groups_update_request.
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsProductGroupsUpdateRequest(
  description: Option[String],
  filters: Option[CatalogsCreativeAssetsProductGroupFilters],
  isFeatured: Option[Boolean],
  name: Option[String],
  catalogType: Option[CatalogsProductGroupsUpdateRequest.CatalogType.Value],
  country: Option[Country],
  locale: Option[CatalogsLocale]
)

object CatalogsProductGroupsUpdateRequest {
  implicit lazy val catalogsProductGroupsUpdateRequestJsonFormat: Format[CatalogsProductGroupsUpdateRequest] = Json.format[CatalogsProductGroupsUpdateRequest]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

