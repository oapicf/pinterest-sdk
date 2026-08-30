package api

import model.Error
import model.PaginationOrder
import model.Schedule
import model.ScheduleBatchUpdate
import model.ScheduleCreate
import model.ScheduleStatus
import model.ScheduleType
import model.SchedulesCreate200ResponseInner
import model.SchedulesList200Response

/**
  * Provides a default implementation for [[SchedulesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class SchedulesApiImpl extends SchedulesApi {
  /**
    * @inheritdoc
    */
  override def schedulesCreate(adAccountId: String, scheduleCreate: List[ScheduleCreate]): List[SchedulesCreate200ResponseInner] = {
    // TODO: Implement better logic

    List.empty[SchedulesCreate200ResponseInner]
  }

  /**
    * @inheritdoc
    */
  override def schedulesList(adAccountId: String, entityIds: List[String], bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder], scheduleStatuses: Option[List[ScheduleStatus]], scheduleType: Option[ScheduleType]): SchedulesList200Response = {
    // TODO: Implement better logic

    SchedulesList200Response(None, List.empty[Schedule])
  }

  /**
    * @inheritdoc
    */
  override def schedulesUpdate(adAccountId: String, scheduleBatchUpdate: List[ScheduleBatchUpdate]): List[SchedulesCreate200ResponseInner] = {
    // TODO: Implement better logic

    List.empty[SchedulesCreate200ResponseInner]
  }
}
