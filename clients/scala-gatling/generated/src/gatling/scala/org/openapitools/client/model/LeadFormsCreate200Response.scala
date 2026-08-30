
package org.openapitools.client.model


case class LeadFormsCreate200Response (
    _items: List[LeadFormsCreate200ResponseItemsInner]
)
object LeadFormsCreate200Response {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
