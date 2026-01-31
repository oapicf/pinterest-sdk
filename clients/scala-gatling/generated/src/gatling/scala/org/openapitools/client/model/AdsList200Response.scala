
package org.openapitools.client.model


case class AdsList200Response (
    _bookmark: Option[String],
    _items: List[AdResponse]
)
object AdsList200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
