package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for multiple_product_groups_inner.
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  * @param feedId Catalog Feed id pertaining to the catalog product group.
  * @param catalogId Catalog id pertaining to the creative assets product group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MultipleProductGroupsInner(
  name: String,
  description: Option[String],
  isFeatured: Option[Boolean],
  filters: CatalogsCreativeAssetsProductGroupFilters,
  feedId: String,
  catalogType: MultipleProductGroupsInner.CatalogType.Value,
  catalogId: String,
  country: Country,
  locale: CatalogsLocale
)

object MultipleProductGroupsInner {
  implicit lazy val multipleProductGroupsInnerJsonFormat: Format[MultipleProductGroupsInner] = Json.format[MultipleProductGroupsInner]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

