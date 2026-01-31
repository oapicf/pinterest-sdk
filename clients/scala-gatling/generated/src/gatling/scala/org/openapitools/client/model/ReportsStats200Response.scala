
package org.openapitools.client.model


case class ReportsStats200Response (
    _bookmark: Option[String],
    _items: List[CatalogsReportStats]
)
object ReportsStats200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
