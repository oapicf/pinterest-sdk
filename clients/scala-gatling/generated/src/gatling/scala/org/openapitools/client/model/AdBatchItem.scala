
package org.openapitools.client.model


case class AdBatchItem (
    _data: Option[Ad],
    _exceptions: Option[Error]
)
object AdBatchItem {
    def toStringBody(var_data: Object, var_exceptions: Object) =
        s"""
        | {
        | "data":$var_data,"exceptions":$var_exceptions
        | }
        """.stripMargin
}
