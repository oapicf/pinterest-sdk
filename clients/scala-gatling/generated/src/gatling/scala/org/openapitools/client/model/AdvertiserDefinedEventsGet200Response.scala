
package org.openapitools.client.model


case class AdvertiserDefinedEventsGet200Response (
    _items: List[AdvertiserDefinedEvent]
)
object AdvertiserDefinedEventsGet200Response {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
