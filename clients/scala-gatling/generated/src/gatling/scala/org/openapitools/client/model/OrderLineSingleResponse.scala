
package org.openapitools.client.model


case class OrderLineSingleResponse (
    _data: Option[OrderLineResponse]
)
object OrderLineSingleResponse {
    def toStringBody(var_data: Object) =
        s"""
        | {
        | "data":$var_data
        | }
        """.stripMargin
}
