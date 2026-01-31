
package org.openapitools.client.model


case class CatalogsReportAllItemsFilter (
    /* Unique identifier of a catalog. If not given, oldest catalog will be used */
    _catalogId: Option[String],
    _reportType: String
)
object CatalogsReportAllItemsFilter {
    def toStringBody(var_catalogId: Object, var_reportType: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"reportType":$var_reportType
        | }
        """.stripMargin
}
