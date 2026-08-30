
package org.openapitools.client.model


case class PromotionArrayElement (
    _data: Option[Promotion],
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
