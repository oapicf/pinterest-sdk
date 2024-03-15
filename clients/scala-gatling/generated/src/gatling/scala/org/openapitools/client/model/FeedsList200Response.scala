
package org.openapitools.client.model


case class FeedsList200Response (
    _items: List[CatalogsFeed],
    _bookmark: Option[String]
)
object FeedsList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
