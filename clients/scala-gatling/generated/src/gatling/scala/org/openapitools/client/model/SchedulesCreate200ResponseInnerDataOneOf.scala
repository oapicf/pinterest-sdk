
package org.openapitools.client.model


case class SchedulesCreate200ResponseInnerDataOneOf (
    _id: String,
    /* Schedule ID. */
    _scheduleId: String,
    _exceptions: Error
)
object SchedulesCreate200ResponseInnerDataOneOf {
    def toStringBody(var_id: Object, var_scheduleId: Object, var_exceptions: Object) =
        s"""
        | {
        | "id":$var_id,"scheduleId":$var_scheduleId,"exceptions":$var_exceptions
        | }
        """.stripMargin
}
