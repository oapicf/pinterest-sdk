
package org.openapitools.client.model


case class SsioOrderLinesGetByAdAccount200Response (
    _bookmark: Option[String],
    _items: List[SSIOOrderLine]
)
object SsioOrderLinesGetByAdAccount200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
