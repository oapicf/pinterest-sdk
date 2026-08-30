package model

import play.api.libs.json._

/**
  * Request object for updating a creative assets product group.
  * @param name Name of catalog product group
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

