
package org.openapitools.client.model


case class AdGroupArrayResponse (
    _items: Option[List[AdGroupArrayResponseElement]]
)
object AdGroupArrayResponse {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
