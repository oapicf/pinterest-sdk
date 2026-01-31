
package org.openapitools.client.model


case class PromotionArrayElement (
    _data: Option[PromotionResponse],
    _exception: Option[Exception]
)
object PromotionArrayElement {
    def toStringBody(var_data: Object, var_exception: Object) =
        s"""
        | {
        | "data":$var_data,"exception":$var_exception
        | }
        """.stripMargin
}
