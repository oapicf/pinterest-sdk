
package org.openapitools.client.model


case class ConversionTagsList200Response (
    _items: List[ConversionTag]
)
object ConversionTagsList200Response {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
