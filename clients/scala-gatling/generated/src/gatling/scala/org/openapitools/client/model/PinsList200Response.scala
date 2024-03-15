
package org.openapitools.client.model


case class PinsList200Response (
    _items: List[Pin],
    _bookmark: Option[String]
)
object PinsList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
