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
import org.openapitools.server.model.LeadForm
import org.openapitools.server.model.LeadFormBatchUpdate
import org.openapitools.server.model.LeadFormCreate
import org.openapitools.server.model.LeadFormTest
import org.openapitools.server.model.LeadFormTestCreate
import org.openapitools.server.model.LeadFormsCreate200Response
import org.openapitools.server.model.LeadFormsList200Response
import org.openapitools.server.model.PaginationOrder


class LeadFormsApi(
    leadFormsService: LeadFormsApiService,
    leadFormsMarshaller: LeadFormsApiMarshaller
) {

  import LeadFormsApiPatterns.leadFormIdPattern
import LeadFormsApiPatterns.adAccountIdPattern

  import leadFormsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "lead_forms" / leadFormIdPattern) { (leadFormId, adAccountId) => 
      get {  
            leadFormsService.leadFormGet(leadFormId = leadFormId, adAccountId = adAccountId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "lead_forms" / leadFormIdPattern / "test") { (adAccountId, leadFormId) => 
      post {  
            entity(as[LeadFormTestCreate]){ leadFormTestCreate =>
              leadFormsService.leadFormTestCreate(adAccountId = adAccountId, leadFormId = leadFormId, leadFormTestCreate = leadFormTestCreate)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "lead_forms") { (adAccountId) => 
      post {  
            entity(as[Seq[LeadFormCreate]]){ leadFormCreate =>
              leadFormsService.leadFormsCreate(adAccountId = adAccountId, leadFormCreate = leadFormCreate)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "lead_forms") { (adAccountId) => 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "order".as[String].?) { (bookmark, pageSize, order) => 
            leadFormsService.leadFormsList(adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize, order = order)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "lead_forms") { (adAccountId) => 
      patch {  
            entity(as[Seq[LeadFormBatchUpdate]]){ leadFormBatchUpdate =>
              leadFormsService.leadFormsUpdate(adAccountId = adAccountId, leadFormBatchUpdate = leadFormBatchUpdate)
            }
      }
    }
}

object LeadFormsApiPatterns {

    val leadFormIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait LeadFormsApiService {

  def leadFormGet200(responseLeadForm: LeadForm)(implicit toEntityMarshallerLeadForm: ToEntityMarshaller[LeadForm]): Route =
    complete((200, responseLeadForm))
  def leadFormGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def leadFormGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def leadFormGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def leadFormGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def leadFormGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def leadFormGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: LeadForm
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def leadFormGet(leadFormId: String, adAccountId: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerLeadForm: ToEntityMarshaller[LeadForm]): Route

  def leadFormTestCreate200(responseLeadFormTest: LeadFormTest)(implicit toEntityMarshallerLeadFormTest: ToEntityMarshaller[LeadFormTest]): Route =
    complete((200, responseLeadFormTest))
  def leadFormTestCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def leadFormTestCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def leadFormTestCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: LeadFormTest
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def leadFormTestCreate(adAccountId: String, leadFormId: String, leadFormTestCreate: LeadFormTestCreate)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerLeadFormTest: ToEntityMarshaller[LeadFormTest]): Route

  def leadFormsCreate200(responseLeadFormsCreate200Response: LeadFormsCreate200Response)(implicit toEntityMarshallerLeadFormsCreate200Response: ToEntityMarshaller[LeadFormsCreate200Response]): Route =
    complete((200, responseLeadFormsCreate200Response))
  def leadFormsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def leadFormsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def leadFormsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def leadFormsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def leadFormsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def leadFormsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: LeadFormsCreate200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def leadFormsCreate(adAccountId: String, leadFormCreate: Seq[LeadFormCreate])
      (implicit toEntityMarshallerLeadFormsCreate200Response: ToEntityMarshaller[LeadFormsCreate200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def leadFormsList200(responseLeadFormsList200Response: LeadFormsList200Response)(implicit toEntityMarshallerLeadFormsList200Response: ToEntityMarshaller[LeadFormsList200Response]): Route =
    complete((200, responseLeadFormsList200Response))
  def leadFormsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def leadFormsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def leadFormsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def leadFormsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def leadFormsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def leadFormsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: LeadFormsList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def leadFormsList(adAccountId: String, bookmark: Option[String], pageSize: Int, order: Option[String])
      (implicit toEntityMarshallerLeadFormsList200Response: ToEntityMarshaller[LeadFormsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def leadFormsUpdate200(responseLeadFormsCreate200Response: LeadFormsCreate200Response)(implicit toEntityMarshallerLeadFormsCreate200Response: ToEntityMarshaller[LeadFormsCreate200Response]): Route =
    complete((200, responseLeadFormsCreate200Response))
  def leadFormsUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def leadFormsUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def leadFormsUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def leadFormsUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def leadFormsUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def leadFormsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: LeadFormsCreate200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def leadFormsUpdate(adAccountId: String, leadFormBatchUpdate: Seq[LeadFormBatchUpdate])
      (implicit toEntityMarshallerLeadFormsCreate200Response: ToEntityMarshaller[LeadFormsCreate200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait LeadFormsApiMarshaller {
  implicit def fromEntityUnmarshallerLeadFormCreateList: FromEntityUnmarshaller[Seq[LeadFormCreate]]

  implicit def fromEntityUnmarshallerLeadFormBatchUpdateList: FromEntityUnmarshaller[Seq[LeadFormBatchUpdate]]

  implicit def fromEntityUnmarshallerLeadFormTestCreate: FromEntityUnmarshaller[LeadFormTestCreate]



  implicit def toEntityMarshallerLeadFormsCreate200Response: ToEntityMarshaller[LeadFormsCreate200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerLeadFormsList200Response: ToEntityMarshaller[LeadFormsList200Response]

  implicit def toEntityMarshallerLeadFormTest: ToEntityMarshaller[LeadFormTest]

  implicit def toEntityMarshallerLeadForm: ToEntityMarshaller[LeadForm]

}

