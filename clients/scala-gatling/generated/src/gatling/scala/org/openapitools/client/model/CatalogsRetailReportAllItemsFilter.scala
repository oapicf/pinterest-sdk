
package org.openapitools.client.model


case class CatalogsRetailReportAllItemsFilter (
    /* Unique identifier of a catalog. If not given, oldest catalog will be used */
    _catalogId: Option[String],
    /* Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature. */
    _productGroupId: Option[String],
    _reportType: String
)
object CatalogsRetailReportAllItemsFilter {
    def toStringBody(var_catalogId: Object, var_productGroupId: Object, var_reportType: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"productGroupId":$var_productGroupId,"reportType":$var_reportType
        | }
        """.stripMargin
}
