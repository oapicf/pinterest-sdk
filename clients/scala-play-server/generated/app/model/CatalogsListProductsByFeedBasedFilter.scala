package model

import play.api.libs.json._

/**
  * Request object to list products for a given feed_id and product group filter.
  * @param feedId Catalog Feed id pertaining to the catalog product group filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsListProductsByFeedBasedFilter(
  feedId: String,
  filters: CatalogsProductGroupFilters
)

object CatalogsListProductsByFeedBasedFilter {
  implicit lazy val catalogsListProductsByFeedBasedFilterJsonFormat: Format[CatalogsListProductsByFeedBasedFilter] = Json.format[CatalogsListProductsByFeedBasedFilter]
}

