
package org.openapitools.client.model


case class AdGroupsCreate200ResponseItemsInner (
    _data: Option[AdGroup],
    _exceptions: Option[List[BatchItemException]]
)
object AdGroupsCreate200ResponseItemsInner {
    def toStringBody(var_data: Object, var_exceptions: Object) =
        s"""
        | {
        | "data":$var_data,"exceptions":$var_exceptions
        | }
        """.stripMargin
}
