
package org.openapitools.client.model


case class LeadFormArrayResponse (
    _items: Option[List[LeadFormArrayResponseItemsInner]]
)
object LeadFormArrayResponse {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
