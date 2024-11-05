package org.openapitools.server.model


/**
 * = feed based product group =
 *
 * Request object to list products for a given feed_id and product group filter.
 *
 * @param feedId Catalog Feed id pertaining to the catalog product group filter. for example: ''2680059592705''
 * @param filters  for example: ''null''
*/
final case class CatalogsListProductsByFeedBasedFilter (
  feedId: String,
  filters: CatalogsProductGroupFilters
)

