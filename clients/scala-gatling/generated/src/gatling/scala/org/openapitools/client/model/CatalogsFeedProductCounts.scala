
package org.openapitools.client.model


case class CatalogsFeedProductCounts (
    /* The number of products in the feed file. */
    _original: Option[Integer],
    /* The number of products successfully ingested from the feed file. */
    _ingested: Option[Integer]
)
object CatalogsFeedProductCounts {
    def toStringBody(var_original: Object, var_ingested: Object) =
        s"""
        | {
        | "original":$var_original,"ingested":$var_ingested
        | }
        """.stripMargin
}
