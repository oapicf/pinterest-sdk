
package org.openapitools.client.model


case class PinsList200Response (
    _bookmark: Option[String],
    _items: List[Pin]
)
object PinsList200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
