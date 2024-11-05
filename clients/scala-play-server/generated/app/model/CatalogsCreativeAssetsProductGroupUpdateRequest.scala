package model

import play.api.libs.json._

/**
  * Request object for updating a creative assets product group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsCreativeAssetsProductGroupUpdateRequest(
  catalogType: Option[CatalogsCreativeAssetsProductGroupUpdateRequest.CatalogType.Value],
  name: Option[String],
  description: Option[String],
  filters: Option[CatalogsCreativeAssetsProductGroupFilters]
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

