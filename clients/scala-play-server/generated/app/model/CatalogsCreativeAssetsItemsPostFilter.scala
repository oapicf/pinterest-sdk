package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsCreativeAssetsItemsPostFilter.
  * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsCreativeAssetsItemsPostFilter(
  catalogType: CatalogsCreativeAssetsItemsPostFilter.CatalogType.Value,
  creativeAssetsIds: List[String],
  catalogId: Option[String]
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

