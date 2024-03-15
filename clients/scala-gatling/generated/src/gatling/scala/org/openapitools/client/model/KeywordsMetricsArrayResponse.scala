
package org.openapitools.client.model


case class KeywordsMetricsArrayResponse (
    _data: Option[List[KeywordMetricsResponse]]
)
object KeywordsMetricsArrayResponse {
    def toStringBody(var_data: Object) =
        s"""
        | {
        | "data":$var_data
        | }
        """.stripMargin
}
