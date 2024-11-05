
package org.openapitools.client.model


case class ProductGroupPromotionResponseItem (
    _data: Option[ProductGroupPromotionResponseElement],
    _exceptions: Option[List[Exception]]
)
object ProductGroupPromotionResponseItem {
    def toStringBody(var_data: Object, var_exceptions: Object) =
        s"""
        | {
        | "data":$var_data,"exceptions":$var_exceptions
        | }
        """.stripMargin
}
