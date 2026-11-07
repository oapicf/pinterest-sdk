package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsCreativeAssetsAvailableFilterValues.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsCreativeAssetsAvailableFilterValues(
  catalogType: CatalogsCreativeAssetsAvailableFilterValues.CatalogType.Value,
  filterValues: CatalogsCreativeAssetsFilterValuesMap
)

object CatalogsCreativeAssetsAvailableFilterValues {
  implicit lazy val catalogsCreativeAssetsAvailableFilterValuesJsonFormat: Format[CatalogsCreativeAssetsAvailableFilterValues] = Json.format[CatalogsCreativeAssetsAvailableFilterValues]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

