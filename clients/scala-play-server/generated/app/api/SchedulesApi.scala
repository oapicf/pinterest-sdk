package api

import play.api.libs.json._
import model.Error
import model.PaginationOrder
import model.Schedule
import model.ScheduleBatchUpdate
import model.ScheduleCreate
import model.ScheduleStatus
import model.ScheduleType
import model.SchedulesCreate200ResponseInner
import model.SchedulesList200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait SchedulesApi {
  /**
    * Create schedules
    * Batch create schedules
    */
  def schedulesCreate(adAccountId: String, scheduleCreate: List[ScheduleCreate]): List[SchedulesCreate200ResponseInner]

  /**
    * Get Schedules
    * Get schedules for a specific advertiser
    * @param entityIds List of Entity IDs, must be associated with the Ad Accound ID provided in the path.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    * @param scheduleStatuses Filter schedules by status (one or more)
    * @param scheduleType Filter schedules by a type
    */
  def schedulesList(adAccountId: String, entityIds: List[String], bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder], scheduleStatuses: Option[List[ScheduleStatus]], scheduleType: Option[ScheduleType]): SchedulesList200Response

  /**
    * Update schedules
    * Update one or more schedules
    */
  def schedulesUpdate(adAccountId: String, scheduleBatchUpdate: List[ScheduleBatchUpdate]): List[SchedulesCreate200ResponseInner]
}
