
package org.openapitools.client.model


case class SchedulesCreate200ResponseInner (
    _data: SchedulesCreate200ResponseInnerData
)
object SchedulesCreate200ResponseInner {
    def toStringBody(var_data: Object) =
        s"""
        | {
        | "data":$var_data
        | }
        """.stripMargin
}
