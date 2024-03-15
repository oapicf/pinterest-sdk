
package org.openapitools.client.model


case class AdArrayResponse (
    _items: Option[List[AdArrayResponseElement]]
)
object AdArrayResponse {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
