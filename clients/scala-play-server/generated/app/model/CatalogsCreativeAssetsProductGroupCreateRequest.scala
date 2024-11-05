package model

import play.api.libs.json._

/**
  * Request object for creating a creative assets product group.
  * @param catalogId Catalog id pertaining to the creative assets product group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsCreativeAssetsProductGroupCreateRequest(
  catalogType: CatalogsCreativeAssetsProductGroupCreateRequest.CatalogType.Value,
  name: String,
  description: Option[String],
  filters: CatalogsCreativeAssetsProductGroupFilters,
  catalogId: String
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

