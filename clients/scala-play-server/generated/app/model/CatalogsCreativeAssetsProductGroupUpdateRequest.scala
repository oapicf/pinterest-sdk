package model

import play.api.libs.json._

/**
  * Request object for updating a creative assets product group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsCreativeAssetsProductGroupUpdateRequest(
  catalogType: Option[CatalogsCreativeAssetsProductGroupUpdateRequest.CatalogType.Value],
  description: Option[String],
  filters: Option[CatalogsCreativeAssetsProductGroupFilters],
  name: Option[String]
)

object CatalogsCreativeAssetsProductGroupUpdateRequest {
  implicit lazy val catalogsCreativeAssetsProductGroupUpdateRequestJsonFormat: Format[CatalogsCreativeAssetsProductGroupUpdateRequest] = Json.format[CatalogsCreativeAssetsProductGroupUpdateRequest]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

