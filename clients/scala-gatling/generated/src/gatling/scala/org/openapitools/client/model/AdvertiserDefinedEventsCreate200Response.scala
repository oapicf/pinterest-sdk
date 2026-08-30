
package org.openapitools.client.model


case class AdvertiserDefinedEventsCreate200Response (
    _items: List[AdvertiserDefinedEventProcessingRecord]
)
object AdvertiserDefinedEventsCreate200Response {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
