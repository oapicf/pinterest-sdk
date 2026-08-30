package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Error
import org.openapitools.server.model.PaginationOrder
import org.openapitools.server.model.Schedule
import org.openapitools.server.model.ScheduleBatchUpdate
import org.openapitools.server.model.ScheduleCreate
import org.openapitools.server.model.ScheduleStatus
import org.openapitools.server.model.ScheduleType
import org.openapitools.server.model.SchedulesCreate200ResponseInner
import org.openapitools.server.model.SchedulesList200Response


class SchedulesApi(
    schedulesService: SchedulesApiService,
    schedulesMarshaller: SchedulesApiMarshaller
) {

  import SchedulesApiPatterns.adAccountIdPattern

  import schedulesMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "schedules") { (adAccountId) => 
      post {  
            entity(as[Seq[ScheduleCreate]]){ scheduleCreate =>
              schedulesService.schedulesCreate(adAccountId = adAccountId, scheduleCreate = scheduleCreate)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "schedules") { (adAccountId) => 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "order".as[String].?, "schedule_statuses".as[String].?, "schedule_type".as[String].?, "entity_ids".as[String]) { (bookmark, pageSize, order, scheduleStatuses, scheduleType, entityIds) => 
            schedulesService.schedulesList(adAccountId = adAccountId, entityIds = entityIds, bookmark = bookmark, pageSize = pageSize, order = order, scheduleStatuses = scheduleStatuses, scheduleType = scheduleType)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "schedules") { (adAccountId) => 
      patch {  
            entity(as[Seq[ScheduleBatchUpdate]]){ scheduleBatchUpdate =>
              schedulesService.schedulesUpdate(adAccountId = adAccountId, scheduleBatchUpdate = scheduleBatchUpdate)
            }
      }
    }
}

object SchedulesApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait SchedulesApiService {

  def schedulesCreate200(responseSchedulesCreate200ResponseInnerarray: Seq[SchedulesCreate200ResponseInner])(implicit toEntityMarshallerSchedulesCreate200ResponseInnerarray: ToEntityMarshaller[Seq[SchedulesCreate200ResponseInner]]): Route =
    complete((200, responseSchedulesCreate200ResponseInnerarray))
  def schedulesCreate201(responseSchedulearray: Seq[Schedule])(implicit toEntityMarshallerSchedulearray: ToEntityMarshaller[Seq[Schedule]]): Route =
    complete((201, responseSchedulearray))
  def schedulesCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def schedulesCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def schedulesCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def schedulesCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def schedulesCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def schedulesCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Seq[SchedulesCreate200ResponseInner]
   * Code: 201, Message: Resource create operation completed successfully., DataType: Seq[Schedule]
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def schedulesCreate(adAccountId: String, scheduleCreate: Seq[ScheduleCreate])
      (implicit toEntityMarshallerSchedulesCreate200ResponseInnerarray: ToEntityMarshaller[Seq[SchedulesCreate200ResponseInner]], toEntityMarshallerSchedulearray: ToEntityMarshaller[Seq[Schedule]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def schedulesList200(responseSchedulesList200Response: SchedulesList200Response)(implicit toEntityMarshallerSchedulesList200Response: ToEntityMarshaller[SchedulesList200Response]): Route =
    complete((200, responseSchedulesList200Response))
  def schedulesList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def schedulesList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def schedulesList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def schedulesList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def schedulesList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def schedulesListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: SchedulesList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def schedulesList(adAccountId: String, entityIds: String, bookmark: Option[String], pageSize: Int, order: Option[String], scheduleStatuses: Option[String], scheduleType: Option[String])
      (implicit toEntityMarshallerSchedulesList200Response: ToEntityMarshaller[SchedulesList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def schedulesUpdate200(responseSchedulesCreate200ResponseInnerarray: Seq[SchedulesCreate200ResponseInner])(implicit toEntityMarshallerSchedulesCreate200ResponseInnerarray: ToEntityMarshaller[Seq[SchedulesCreate200ResponseInner]]): Route =
    complete((200, responseSchedulesCreate200ResponseInnerarray))
  def schedulesUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def schedulesUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def schedulesUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def schedulesUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def schedulesUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def schedulesUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Seq[SchedulesCreate200ResponseInner]
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def schedulesUpdate(adAccountId: String, scheduleBatchUpdate: Seq[ScheduleBatchUpdate])
      (implicit toEntityMarshallerSchedulesCreate200ResponseInnerarray: ToEntityMarshaller[Seq[SchedulesCreate200ResponseInner]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait SchedulesApiMarshaller {
  implicit def fromEntityUnmarshallerScheduleBatchUpdateList: FromEntityUnmarshaller[Seq[ScheduleBatchUpdate]]

  implicit def fromEntityUnmarshallerScheduleCreateList: FromEntityUnmarshaller[Seq[ScheduleCreate]]



  implicit def toEntityMarshallerSchedulesCreate200ResponseInnerarray: ToEntityMarshaller[Seq[SchedulesCreate200ResponseInner]]

  implicit def toEntityMarshallerSchedulesList200Response: ToEntityMarshaller[SchedulesList200Response]

  implicit def toEntityMarshallerSchedulearray: ToEntityMarshaller[Seq[Schedule]]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

