
package org.openapitools.client.model


case class CatalogsCreateReportResponse (
    /* Token to be used to get the report */
    _token: Option[String]
)
object CatalogsCreateReportResponse {
    def toStringBody(var_token: Object) =
        s"""
        | {
        | "token":$var_token
        | }
        """.stripMargin
}
