
package org.openapitools.client.model


case class Schedule (
    _deltaValue: Option[ScheduleDeltaValue],
    /* Schedule end time. Unix timestamp in seconds. */
    _endTimestamp: Option[Integer],
    /* entity ID. */
    _entityId: String,
    /* Specify the entity_type to get summary information */
    _entityType: Option[AdAccountEntityType],
    /* Schedule name. */
    _name: Option[String],
    /* The schedule action. */
    _scheduleAction: Option[ScheduleAction],
    /* Schedule ID. */
    _scheduleId: String,
    /* Schedule status. */
    _scheduleStatus: Option[ScheduleStatus],
    /* The schedule type. */
    _scheduleType: Option[ScheduleType],
    /* Schedule start time. Unix timestamp in seconds. */
    _startTimestamp: Option[Integer]
)
object Schedule {
    def toStringBody(var_deltaValue: Object, var_endTimestamp: Object, var_entityId: Object, var_entityType: Object, var_name: Object, var_scheduleAction: Object, var_scheduleId: Object, var_scheduleStatus: Object, var_scheduleType: Object, var_startTimestamp: Object) =
        s"""
        | {
        | "deltaValue":$var_deltaValue,"endTimestamp":$var_endTimestamp,"entityId":$var_entityId,"entityType":$var_entityType,"name":$var_name,"scheduleAction":$var_scheduleAction,"scheduleId":$var_scheduleId,"scheduleStatus":$var_scheduleStatus,"scheduleType":$var_scheduleType,"startTimestamp":$var_startTimestamp
        | }
        """.stripMargin
}
