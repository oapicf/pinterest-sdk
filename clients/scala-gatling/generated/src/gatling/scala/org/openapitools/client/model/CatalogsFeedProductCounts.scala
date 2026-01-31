
package org.openapitools.client.model


case class CatalogsFeedProductCounts (
    /* The number of products successfully ingested from the feed file. */
    _ingested: Option[Integer],
    /* The number of products in the feed file. */
    _original: Option[Integer]
)
object CatalogsFeedProductCounts {
    def toStringBody(var_ingested: Object, var_original: Object) =
        s"""
        | {
        | "ingested":$var_ingested,"original":$var_original
        | }
        """.stripMargin
}
