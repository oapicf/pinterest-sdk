
package org.openapitools.client.model


case class MetricsResponse (
    _data: Option[List[Any]]
)
object MetricsResponse {
    def toStringBody(var_data: Object) =
        s"""
        | {
        | "data":$var_data
        | }
        """.stripMargin
}
