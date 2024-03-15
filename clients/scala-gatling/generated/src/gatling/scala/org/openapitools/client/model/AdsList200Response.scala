
package org.openapitools.client.model


case class AdsList200Response (
    _items: List[AdResponse],
    _bookmark: Option[String]
)
object AdsList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
