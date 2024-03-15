
package org.openapitools.client.model


case class AdArrayResponseElement (
    _data: Option[AdResponse],
    _exceptions: Option[Exception]
)
object AdArrayResponseElement {
    def toStringBody(var_data: Object, var_exceptions: Object) =
        s"""
        | {
        | "data":$var_data,"exceptions":$var_exceptions
        | }
        """.stripMargin
}
