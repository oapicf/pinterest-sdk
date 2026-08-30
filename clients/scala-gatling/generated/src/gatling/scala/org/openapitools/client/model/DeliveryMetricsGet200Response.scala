
package org.openapitools.client.model


case class DeliveryMetricsGet200Response (
    _items: List[DeliveryMetricsResponseItemsItems]
)
object DeliveryMetricsGet200Response {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
