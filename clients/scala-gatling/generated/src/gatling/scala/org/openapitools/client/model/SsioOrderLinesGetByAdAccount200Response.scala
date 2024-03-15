
package org.openapitools.client.model


case class SsioOrderLinesGetByAdAccount200Response (
    /* SSIO order lines by ad acount id */
    _items: List[SSIOOrderLine],
    _bookmark: Option[String]
)
object SsioOrderLinesGetByAdAccount200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
