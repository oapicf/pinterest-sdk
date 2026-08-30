
package org.openapitools.client.model


case class AdGroupsCreate200Response (
    _items: List[AdGroupsCreate200ResponseItemsInner]
)
object AdGroupsCreate200Response {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
