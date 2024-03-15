
package org.openapitools.client.model


case class AdGroupArrayResponseElement (
    _data: Option[AdGroupResponse],
    _exceptions: Option[List[Exception]]
)
object AdGroupArrayResponseElement {
    def toStringBody(var_data: Object, var_exceptions: Object) =
        s"""
        | {
        | "data":$var_data,"exceptions":$var_exceptions
        | }
        """.stripMargin
}
