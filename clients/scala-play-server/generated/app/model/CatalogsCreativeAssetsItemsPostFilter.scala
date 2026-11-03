package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsCreativeAssetsItemsPostFilter.
  * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsCreativeAssetsItemsPostFilter(
  catalogId: Option[String],
  catalogType: CatalogsCreativeAssetsItemsPostFilter.CatalogType.Value,
  creativeAssetsIds: List[String]
)

object CatalogsCreativeAssetsItemsPostFilter {
  implicit lazy val catalogsCreativeAssetsItemsPostFilterJsonFormat: Format[CatalogsCreativeAssetsItemsPostFilter] = Json.format[CatalogsCreativeAssetsItemsPostFilter]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

