
package org.openapitools.client.model


case class CatalogsFeedIngestionInfo (
    /* The number of ingested products that are in stock. */
    _IN_STOCK: Option[Integer],
    /* The number of ingested products that are in out of stock. */
    _OUT_OF_STOCK: Option[Integer],
    /* The number of ingested products that are in preorder. */
    _PREORDER: Option[Integer]
)
object CatalogsFeedIngestionInfo {
    def toStringBody(var_IN_STOCK: Object, var_OUT_OF_STOCK: Object, var_PREORDER: Object) =
        s"""
        | {
        | "IN_STOCK":$var_IN_STOCK,"OUT_OF_STOCK":$var_OUT_OF_STOCK,"PREORDER":$var_PREORDER
        | }
        """.stripMargin
}
