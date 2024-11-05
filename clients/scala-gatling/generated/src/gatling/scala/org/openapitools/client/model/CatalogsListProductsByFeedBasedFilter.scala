
package org.openapitools.client.model


case class CatalogsListProductsByFeedBasedFilter (
    /* Catalog Feed id pertaining to the catalog product group filter. */
    _feedId: String,
    _filters: CatalogsProductGroupFilters
)
object CatalogsListProductsByFeedBasedFilter {
    def toStringBody(var_feedId: Object, var_filters: Object) =
        s"""
        | {
        | "feedId":$var_feedId,"filters":$var_filters
        | }
        """.stripMargin
}
