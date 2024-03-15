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
import org.openapitools.server.model.LeadFormResponse
import org.openapitools.server.model.LeadFormTestRequest
import org.openapitools.server.model.LeadFormTestResponse
import org.openapitools.server.model.LeadFormsList200Response


class LeadFormsApi(
    leadFormsService: LeadFormsApiService,
    leadFormsMarshaller: LeadFormsApiMarshaller
) {

  import LeadFormsApiPatterns.adAccountIdPattern
import LeadFormsApiPatterns.leadFormIdPattern

  import leadFormsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "lead_forms" / leadFormIdPattern) { (adAccountId, leadFormId) => 
      get {  
            leadFormsService.leadFormGet(adAccountId = adAccountId, leadFormId = leadFormId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "lead_forms" / leadFormIdPattern / "test") { (adAccountId, leadFormId) => 
      post {  
            entity(as[LeadFormTestRequest]){ leadFormTestRequest =>
              leadFormsService.leadFormTestCreate(adAccountId = adAccountId, leadFormId = leadFormId, leadFormTestRequest = leadFormTestRequest)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "lead_forms") { (adAccountId) => 
      get { 
        parameters("page_size".as[Int].?(25), "order".as[String].?, "bookmark".as[String].?) { (pageSize, order, bookmark) => 
            leadFormsService.leadFormsList(adAccountId = adAccountId, pageSize = pageSize, order = order, bookmark = bookmark)
        }
      }
    }
}

object LeadFormsApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val leadFormIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait LeadFormsApiService {

  def leadFormGet200(responseLeadFormResponse: LeadFormResponse)(implicit toEntityMarshallerLeadFormResponse: ToEntityMarshaller[LeadFormResponse]): Route =
    complete((200, responseLeadFormResponse))
  def leadFormGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def leadFormGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def leadFormGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: LeadFormResponse
   * Code: 400, Message: Invalid ad account lead forms parameters., DataType: Error
   * Code: 404, Message: The lead form ID for the given ad account ID does not exist., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def leadFormGet(adAccountId: String, leadFormId: String)
      (implicit toEntityMarshallerLeadFormResponse: ToEntityMarshaller[LeadFormResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def leadFormTestCreate200(responseLeadFormTestResponse: LeadFormTestResponse)(implicit toEntityMarshallerLeadFormTestResponse: ToEntityMarshaller[LeadFormTestResponse]): Route =
    complete((200, responseLeadFormTestResponse))
  def leadFormTestCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def leadFormTestCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def leadFormTestCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: LeadFormTestResponse
   * Code: 400, Message: Invalid parameters., DataType: Error
   * Code: 404, Message: Lead not found., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def leadFormTestCreate(adAccountId: String, leadFormId: String, leadFormTestRequest: LeadFormTestRequest)
      (implicit toEntityMarshallerLeadFormTestResponse: ToEntityMarshaller[LeadFormTestResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def leadFormsList200(responseLeadFormsList200Response: LeadFormsList200Response)(implicit toEntityMarshallerLeadFormsList200Response: ToEntityMarshaller[LeadFormsList200Response]): Route =
    complete((200, responseLeadFormsList200Response))
  def leadFormsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def leadFormsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: LeadFormsList200Response
   * Code: 400, Message: Invalid ad account lead forms parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def leadFormsList(adAccountId: String, pageSize: Int, order: Option[String], bookmark: Option[String])
      (implicit toEntityMarshallerLeadFormsList200Response: ToEntityMarshaller[LeadFormsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait LeadFormsApiMarshaller {
  implicit def fromEntityUnmarshallerLeadFormTestRequest: FromEntityUnmarshaller[LeadFormTestRequest]



  implicit def toEntityMarshallerLeadFormResponse: ToEntityMarshaller[LeadFormResponse]

  implicit def toEntityMarshallerLeadFormTestResponse: ToEntityMarshaller[LeadFormTestResponse]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerLeadFormsList200Response: ToEntityMarshaller[LeadFormsList200Response]

}

