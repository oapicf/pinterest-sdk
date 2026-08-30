
package org.openapitools.client.model


case class LeadFormsCreate200ResponseItemsInner (
    _data: Option[LeadForm],
    _exceptions: Option[List[BatchItemException]]
)
object LeadFormsCreate200ResponseItemsInner {
    def toStringBody(var_data: Object, var_exceptions: Object) =
        s"""
        | {
        | "data":$var_data,"exceptions":$var_exceptions
        | }
        """.stripMargin
}
