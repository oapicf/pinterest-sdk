
package org.openapitools.client.model


case class ScheduleCreateRequest (
    _entityId: String,
    /* Entity type */
    _entityType: String,
    _deltaValue: ScheduleCommonDeltaValue,
    /* Schedule end time. Unix timestamp in seconds. */
    _endTimestamp: Integer,
    _name: String,
    _scheduleAction: ScheduleAction,
    _scheduleStatus: ScheduleStatus,
    _scheduleType: ScheduleType,
    /* Schedule start time. Unix timestamp in seconds. */
    _startTimestamp: Integer
)
object ScheduleCreateRequest {
    def toStringBody(var_entityId: Object, var_entityType: Object, var_deltaValue: Object, var_endTimestamp: Object, var_name: Object, var_scheduleAction: Object, var_scheduleStatus: Object, var_scheduleType: Object, var_startTimestamp: Object) =
        s"""
        | {
        | "entityId":$var_entityId,"entityType":$var_entityType,"deltaValue":$var_deltaValue,"endTimestamp":$var_endTimestamp,"name":$var_name,"scheduleAction":$var_scheduleAction,"scheduleStatus":$var_scheduleStatus,"scheduleType":$var_scheduleType,"startTimestamp":$var_startTimestamp
        | }
        """.stripMargin
}
