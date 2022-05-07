
package org.openapitools.client.model


case class CatalogsFeedProductCounts (
    /* The number of products in the feed file */
    _original: Option[Integer]
)
object CatalogsFeedProductCounts {
    def toStringBody(var_original: Object) =
        s"""
        | {
        | "original":$var_original
        | }
        """.stripMargin
}
