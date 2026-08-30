package model

import play.api.libs.json._

/**
  * Request object for creating a creative assets product group.
  * @param catalogId Catalog ID pertaining to the product group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsCreativeAssetsProductGroupCreateRequest(
  catalogId: String,
  catalogType: CatalogsCreativeAssetsProductGroupCreateRequest.CatalogType.Value,
  description: Option[String],
  filters: CatalogsCreativeAssetsProductGroupFilters,
  name: String
)

object CatalogsCreativeAssetsProductGroupCreateRequest {
  implicit lazy val catalogsCreativeAssetsProductGroupCreateRequestJsonFormat: Format[CatalogsCreativeAssetsProductGroupCreateRequest] = Json.format[CatalogsCreativeAssetsProductGroupCreateRequest]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

