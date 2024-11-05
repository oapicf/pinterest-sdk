
package org.openapitools.client.model


case class ReportsStats200Response (
    _items: List[CatalogsReportStats],
    _bookmark: Option[String]
)
object ReportsStats200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
