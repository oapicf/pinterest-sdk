
package org.openapitools.client.model


case class FeedsList200Response (
    _bookmark: Option[String],
    _items: List[CatalogsFeed]
)
object FeedsList200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
