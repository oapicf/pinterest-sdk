package model

import play.api.libs.json._

/**
  * Request object to list products for a given feed_id and product group filter.
  * @param feedId Catalog Feed id pertaining to the catalog product group filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsListProductsByFeedBasedFilter(
  feedId: String,
  filters: CatalogsProductGroupFilters
)

object CatalogsListProductsByFeedBasedFilter {
  implicit lazy val catalogsListProductsByFeedBasedFilterJsonFormat: Format[CatalogsListProductsByFeedBasedFilter] = Json.format[CatalogsListProductsByFeedBasedFilter]
}

