
package org.openapitools.client.model


case class AdvertiserDefinedEventsResponse (
    _items: Option[List[AdvertiserDefinedEvent]]
)
object AdvertiserDefinedEventsResponse {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
