
package org.openapitools.client.model


case class OrderLineMutationResponse (
    _data: Option[OrderLineMutationResult]
)
object OrderLineMutationResponse {
    def toStringBody(var_data: Object) =
        s"""
        | {
        | "data":$var_data
        | }
        """.stripMargin
}
