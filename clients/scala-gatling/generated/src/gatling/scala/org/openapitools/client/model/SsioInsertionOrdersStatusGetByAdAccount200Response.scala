
package org.openapitools.client.model


case class SsioInsertionOrdersStatusGetByAdAccount200Response (
    _bookmark: Option[String],
    /* Insertion orders status by ad acount id */
    _items: List[SSIOInsertionOrderStatus]
)
object SsioInsertionOrdersStatusGetByAdAccount200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
