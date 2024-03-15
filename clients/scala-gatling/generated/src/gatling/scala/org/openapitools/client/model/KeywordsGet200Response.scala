
package org.openapitools.client.model


case class KeywordsGet200Response (
    _items: List[Keyword],
    _bookmark: Option[String]
)
object KeywordsGet200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
