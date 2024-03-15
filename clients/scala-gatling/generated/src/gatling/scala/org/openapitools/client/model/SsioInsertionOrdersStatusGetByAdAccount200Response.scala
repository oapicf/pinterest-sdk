
package org.openapitools.client.model


case class SsioInsertionOrdersStatusGetByAdAccount200Response (
    /* Insertion orders status by ad acount id */
    _items: List[SSIOInsertionOrderStatus],
    _bookmark: Option[String]
)
object SsioInsertionOrdersStatusGetByAdAccount200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
