
package org.openapitools.client.model


case class DeliveryMetricsResponse (
    _items: Option[List[DeliveryMetricsResponseItemsInner]]
)
object DeliveryMetricsResponse {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
