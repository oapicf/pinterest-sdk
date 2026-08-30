
package org.openapitools.client.model


case class MetricsResponse (
    _data: Option[List[MetricsResponseDataItems]]
)
object MetricsResponse {
    def toStringBody(var_data: Object) =
        s"""
        | {
        | "data":$var_data
        | }
        """.stripMargin
}
