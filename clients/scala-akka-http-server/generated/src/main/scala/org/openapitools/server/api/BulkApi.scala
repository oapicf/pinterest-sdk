package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.BulkDownload
import org.openapitools.server.model.BulkDownloadCreate
import org.openapitools.server.model.BulkJobData
import org.openapitools.server.model.BulkUpsertRequest
import org.openapitools.server.model.BulkUpsertResponse
import org.openapitools.server.model.Error


class BulkApi(
    bulkService: BulkApiService,
    bulkMarshaller: BulkApiMarshaller
) {

  import BulkApiPatterns.adAccountIdPattern

  import bulkMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "bulk" / "download") { (adAccountId) => 
      post {  
            entity(as[BulkDownloadCreate]){ bulkDownloadCreate =>
              bulkService.bulkDownloadCreate(adAccountId = adAccountId, bulkDownloadCreate = bulkDownloadCreate)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "bulk" / Segment) { (adAccountId, bulkRequestId) => 
      get { 
        parameters("include_details".as[Boolean].?(false)) { (includeDetails) => 
            bulkService.bulkRequestGet(adAccountId = adAccountId, bulkRequestId = bulkRequestId, includeDetails = includeDetails)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "bulk" / "upsert") { (adAccountId) => 
      post {  
            entity(as[BulkUpsertRequest]){ bulkUpsertRequest =>
              bulkService.bulkUpsertCreate(adAccountId = adAccountId, bulkUpsertRequest = bulkUpsertRequest)
            }
      }
    }
}

object BulkApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait BulkApiService {

  def bulkDownloadCreate200(responseBulkDownload: BulkDownload)(implicit toEntityMarshallerBulkDownload: ToEntityMarshaller[BulkDownload]): Route =
    complete((200, responseBulkDownload))
  def bulkDownloadCreate201(responseBulkDownload: BulkDownload)(implicit toEntityMarshallerBulkDownload: ToEntityMarshaller[BulkDownload]): Route =
    complete((201, responseBulkDownload))
  def bulkDownloadCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def bulkDownloadCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def bulkDownloadCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def bulkDownloadCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def bulkDownloadCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def bulkDownloadCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BulkDownload
   * Code: 201, Message: Resource create operation completed successfully., DataType: BulkDownload
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def bulkDownloadCreate(adAccountId: String, bulkDownloadCreate: BulkDownloadCreate)
      (implicit toEntityMarshallerBulkDownload: ToEntityMarshaller[BulkDownload], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def bulkRequestGet200(responseBulkJobData: BulkJobData)(implicit toEntityMarshallerBulkJobData: ToEntityMarshaller[BulkJobData]): Route =
    complete((200, responseBulkJobData))
  def bulkRequestGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def bulkRequestGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def bulkRequestGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def bulkRequestGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def bulkRequestGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def bulkRequestGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BulkJobData
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def bulkRequestGet(adAccountId: String, bulkRequestId: String, includeDetails: Boolean)
      (implicit toEntityMarshallerBulkJobData: ToEntityMarshaller[BulkJobData], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def bulkUpsertCreate200(responseBulkUpsertResponse: BulkUpsertResponse)(implicit toEntityMarshallerBulkUpsertResponse: ToEntityMarshaller[BulkUpsertResponse]): Route =
    complete((200, responseBulkUpsertResponse))
  def bulkUpsertCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BulkUpsertResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def bulkUpsertCreate(adAccountId: String, bulkUpsertRequest: BulkUpsertRequest)
      (implicit toEntityMarshallerBulkUpsertResponse: ToEntityMarshaller[BulkUpsertResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait BulkApiMarshaller {
  implicit def fromEntityUnmarshallerBulkDownloadCreate: FromEntityUnmarshaller[BulkDownloadCreate]

  implicit def fromEntityUnmarshallerBulkUpsertRequest: FromEntityUnmarshaller[BulkUpsertRequest]



  implicit def toEntityMarshallerBulkUpsertResponse: ToEntityMarshaller[BulkUpsertResponse]

  implicit def toEntityMarshallerBulkDownload: ToEntityMarshaller[BulkDownload]

  implicit def toEntityMarshallerBulkJobData: ToEntityMarshaller[BulkJobData]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

