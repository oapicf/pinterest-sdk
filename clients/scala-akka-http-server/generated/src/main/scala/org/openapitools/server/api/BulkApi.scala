package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.BulkDownloadRequest
import org.openapitools.server.model.BulkDownloadResponse
import org.openapitools.server.model.BulkUpsertRequest
import org.openapitools.server.model.BulkUpsertResponse
import org.openapitools.server.model.BulkUpsertStatusResponse
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
            entity(as[BulkDownloadRequest]){ bulkDownloadRequest =>
              bulkService.bulkDownloadCreate(adAccountId = adAccountId, bulkDownloadRequest = bulkDownloadRequest)
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

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait BulkApiService {

  def bulkDownloadCreate200(responseBulkDownloadResponse: BulkDownloadResponse)(implicit toEntityMarshallerBulkDownloadResponse: ToEntityMarshaller[BulkDownloadResponse]): Route =
    complete((200, responseBulkDownloadResponse))
  def bulkDownloadCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: BulkDownloadResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def bulkDownloadCreate(adAccountId: String, bulkDownloadRequest: BulkDownloadRequest)
      (implicit toEntityMarshallerBulkDownloadResponse: ToEntityMarshaller[BulkDownloadResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def bulkRequestGet200(responseBulkUpsertStatusResponse: BulkUpsertStatusResponse)(implicit toEntityMarshallerBulkUpsertStatusResponse: ToEntityMarshaller[BulkUpsertStatusResponse]): Route =
    complete((200, responseBulkUpsertStatusResponse))
  def bulkRequestGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: BulkUpsertStatusResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def bulkRequestGet(adAccountId: String, bulkRequestId: String, includeDetails: Boolean)
      (implicit toEntityMarshallerBulkUpsertStatusResponse: ToEntityMarshaller[BulkUpsertStatusResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def bulkUpsertCreate200(responseBulkUpsertResponse: BulkUpsertResponse)(implicit toEntityMarshallerBulkUpsertResponse: ToEntityMarshaller[BulkUpsertResponse]): Route =
    complete((200, responseBulkUpsertResponse))
  def bulkUpsertCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: BulkUpsertResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def bulkUpsertCreate(adAccountId: String, bulkUpsertRequest: BulkUpsertRequest)
      (implicit toEntityMarshallerBulkUpsertResponse: ToEntityMarshaller[BulkUpsertResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait BulkApiMarshaller {
  implicit def fromEntityUnmarshallerBulkDownloadRequest: FromEntityUnmarshaller[BulkDownloadRequest]

  implicit def fromEntityUnmarshallerBulkUpsertRequest: FromEntityUnmarshaller[BulkUpsertRequest]



  implicit def toEntityMarshallerBulkUpsertResponse: ToEntityMarshaller[BulkUpsertResponse]

  implicit def toEntityMarshallerBulkDownloadResponse: ToEntityMarshaller[BulkDownloadResponse]

  implicit def toEntityMarshallerBulkUpsertStatusResponse: ToEntityMarshaller[BulkUpsertStatusResponse]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

