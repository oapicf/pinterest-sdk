package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsCreativeAssetsItemsFilter.
  * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsCreativeAssetsItemsFilter(
  catalogType: CatalogsCreativeAssetsItemsFilter.CatalogType.Value,
  creativeAssetsIds: List[String],
  catalogId: Option[String]
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

