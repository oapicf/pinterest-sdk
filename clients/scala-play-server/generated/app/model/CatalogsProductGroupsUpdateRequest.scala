package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for catalogs_product_groups_update_request.
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsProductGroupsUpdateRequest(
  name: Option[String],
  description: Option[String],
  isFeatured: Option[Boolean],
  filters: Option[CatalogsCreativeAssetsProductGroupFilters],
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

