
package org.openapitools.client.model


case class ConversionTagListResponse (
    _items: Option[List[ConversionTag]]
)
object ConversionTagListResponse {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}
