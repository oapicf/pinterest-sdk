package model

import play.api.libs.json._

/**
  * Request object to list products for a given feed_id and product group filter.
  * @param feedId Catalog Feed id pertaining to the catalog product group filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsListProductsByFeedBasedFilter(
  feedId: String,
  filters: CatalogsProductGroupFilters
)

object CatalogsListProductsByFeedBasedFilter {
  implicit lazy val catalogsListProductsByFeedBasedFilterJsonFormat: Format[CatalogsListProductsByFeedBasedFilter] = Json.format[CatalogsListProductsByFeedBasedFilter]
}

