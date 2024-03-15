
package org.openapitools.client.model


case class FeedProcessingResultsList200Response (
    _items: List[CatalogsFeedProcessingResult],
    _bookmark: Option[String]
)
object FeedProcessingResultsList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
