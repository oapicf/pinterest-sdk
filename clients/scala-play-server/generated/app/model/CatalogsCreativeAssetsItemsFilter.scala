package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsCreativeAssetsItemsFilter.
  * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsCreativeAssetsItemsFilter(
  catalogId: Option[String],
  catalogType: CatalogsCreativeAssetsItemsFilter.CatalogType.Value,
  creativeAssetsIds: List[String]
)

object CatalogsCreativeAssetsItemsFilter {
  implicit lazy val catalogsCreativeAssetsItemsFilterJsonFormat: Format[CatalogsCreativeAssetsItemsFilter] = Json.format[CatalogsCreativeAssetsItemsFilter]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

