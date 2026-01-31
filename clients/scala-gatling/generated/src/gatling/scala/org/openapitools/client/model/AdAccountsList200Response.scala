
package org.openapitools.client.model


case class AdAccountsList200Response (
    _bookmark: Option[String],
    _items: List[AdAccount]
)
object AdAccountsList200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
