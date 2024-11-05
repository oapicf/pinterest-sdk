
package org.openapitools.client.model


case class LeadFormArrayResponseItemsInner (
    _data: Option[LeadFormResponse],
    _exceptions: Option[List[Exception]]
)
object LeadFormArrayResponseItemsInner {
    def toStringBody(var_data: Object, var_exceptions: Object) =
        s"""
        | {
        | "data":$var_data,"exceptions":$var_exceptions
        | }
        """.stripMargin
}
