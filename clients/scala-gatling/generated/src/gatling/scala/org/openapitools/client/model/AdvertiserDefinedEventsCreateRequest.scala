
package org.openapitools.client.model


case class AdvertiserDefinedEventsCreateRequest (
    /* List of advertiser defined events to create or update */
    _items: List[AdvertiserDefinedEventInput]
)
object AdvertiserDefinedEventsCreateRequest {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
