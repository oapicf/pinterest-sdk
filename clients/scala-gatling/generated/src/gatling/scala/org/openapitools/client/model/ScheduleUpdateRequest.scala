
package org.openapitools.client.model


case class ScheduleUpdateRequest (
    _entityId: Option[String],
    /* Entity type */
    _entityType: Option[String],
    /* Schedule ID. */
    _id: String,
    _deltaValue: Option[ScheduleCommonDeltaValue],
    /* Schedule end time. Unix timestamp in seconds. */
    _endTimestamp: Option[Integer],
    _name: Option[String],
    _scheduleAction: Option[ScheduleAction],
    _scheduleStatus: Option[ScheduleStatus],
    _scheduleType: Option[ScheduleType],
    /* Schedule start time. Unix timestamp in seconds. */
    _startTimestamp: Option[Integer]
)
object ScheduleUpdateRequest {
    def toStringBody(var_entityId: Object, var_entityType: Object, var_id: Object, var_deltaValue: Object, var_endTimestamp: Object, var_name: Object, var_scheduleAction: Object, var_scheduleStatus: Object, var_scheduleType: Object, var_startTimestamp: Object) =
        s"""
        | {
        | "entityId":$var_entityId,"entityType":$var_entityType,"id":$var_id,"deltaValue":$var_deltaValue,"endTimestamp":$var_endTimestamp,"name":$var_name,"scheduleAction":$var_scheduleAction,"scheduleStatus":$var_scheduleStatus,"scheduleType":$var_scheduleType,"startTimestamp":$var_startTimestamp
        | }
        """.stripMargin
}
