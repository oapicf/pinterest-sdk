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
import org.openapitools.server.model.LeadsExportCreateRequest
import org.openapitools.server.model.LeadsExportCreateResponse
import org.openapitools.server.model.LeadsExportResponseData


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
            entity(as[LeadsExportCreateRequest]){ leadsExportCreateRequest =>
              leadsExportService.leadsExportCreate(adAccountId = adAccountId, leadsExportCreateRequest = leadsExportCreateRequest)
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

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val leadsExportIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait LeadsExportApiService {

  def leadsExportCreate200(responseLeadsExportCreateResponse: LeadsExportCreateResponse)(implicit toEntityMarshallerLeadsExportCreateResponse: ToEntityMarshaller[LeadsExportCreateResponse]): Route =
    complete((200, responseLeadsExportCreateResponse))
  def leadsExportCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def leadsExportCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: LeadsExportCreateResponse
   * Code: 400, Message: Invalid ad account parameter., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def leadsExportCreate(adAccountId: String, leadsExportCreateRequest: LeadsExportCreateRequest)
      (implicit toEntityMarshallerLeadsExportCreateResponse: ToEntityMarshaller[LeadsExportCreateResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def leadsExportGet200(responseLeadsExportResponseData: LeadsExportResponseData)(implicit toEntityMarshallerLeadsExportResponseData: ToEntityMarshaller[LeadsExportResponseData]): Route =
    complete((200, responseLeadsExportResponseData))
  def leadsExportGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def leadsExportGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def leadsExportGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: LeadsExportResponseData
   * Code: 400, Message: Invalid ad account parameter., DataType: Error
   * Code: 404, Message: Invalid leads export id parameter., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def leadsExportGet(adAccountId: String, leadsExportId: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerLeadsExportResponseData: ToEntityMarshaller[LeadsExportResponseData]): Route

}

trait LeadsExportApiMarshaller {
  implicit def fromEntityUnmarshallerLeadsExportCreateRequest: FromEntityUnmarshaller[LeadsExportCreateRequest]



  implicit def toEntityMarshallerLeadsExportCreateResponse: ToEntityMarshaller[LeadsExportCreateResponse]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerLeadsExportResponseData: ToEntityMarshaller[LeadsExportResponseData]

}

