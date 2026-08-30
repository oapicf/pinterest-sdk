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
import org.openapitools.server.model.LeadsExportResponseData
import org.openapitools.server.model.LeadsExports
import org.openapitools.server.model.LeadsExportsCreate


class LeadsExportApi(
    leadsExportService: LeadsExportApiService,
    leadsExportMarshaller: LeadsExportApiMarshaller
) {

  import LeadsExportApiPatterns.adAccountIdPattern
import LeadsExportApiPatterns.leadsExportIdPattern

  import leadsExportMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "leads_export") { (adAccountId) => 
      post {  
            entity(as[LeadsExportsCreate]){ leadsExportsCreate =>
              leadsExportService.leadsExportCreate(adAccountId = adAccountId, leadsExportsCreate = leadsExportsCreate)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "leads_export" / leadsExportIdPattern) { (adAccountId, leadsExportId) => 
      get {  
            leadsExportService.leadsExportGet(adAccountId = adAccountId, leadsExportId = leadsExportId)
      }
    }
}

object LeadsExportApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
val leadsExportIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait LeadsExportApiService {

  def leadsExportCreate200(responseLeadsExports: LeadsExports)(implicit toEntityMarshallerLeadsExports: ToEntityMarshaller[LeadsExports]): Route =
    complete((200, responseLeadsExports))
  def leadsExportCreate201(responseLeadsExports: LeadsExports)(implicit toEntityMarshallerLeadsExports: ToEntityMarshaller[LeadsExports]): Route =
    complete((201, responseLeadsExports))
  def leadsExportCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def leadsExportCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def leadsExportCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def leadsExportCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def leadsExportCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def leadsExportCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: LeadsExports
   * Code: 201, Message: Resource create operation completed successfully., DataType: LeadsExports
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def leadsExportCreate(adAccountId: String, leadsExportsCreate: LeadsExportsCreate)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerLeadsExports: ToEntityMarshaller[LeadsExports]): Route

  def leadsExportGet200(responseLeadsExportResponseData: LeadsExportResponseData)(implicit toEntityMarshallerLeadsExportResponseData: ToEntityMarshaller[LeadsExportResponseData]): Route =
    complete((200, responseLeadsExportResponseData))
  def leadsExportGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def leadsExportGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def leadsExportGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def leadsExportGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def leadsExportGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def leadsExportGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: LeadsExportResponseData
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def leadsExportGet(adAccountId: String, leadsExportId: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerLeadsExportResponseData: ToEntityMarshaller[LeadsExportResponseData]): Route

}

trait LeadsExportApiMarshaller {
  implicit def fromEntityUnmarshallerLeadsExportsCreate: FromEntityUnmarshaller[LeadsExportsCreate]



  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerLeadsExports: ToEntityMarshaller[LeadsExports]

  implicit def toEntityMarshallerLeadsExportResponseData: ToEntityMarshaller[LeadsExportResponseData]

}

