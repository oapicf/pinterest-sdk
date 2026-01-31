package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.ConversionEventResponse
import org.openapitools.server.model.ConversionTag
import org.openapitools.server.model.ConversionTagCreate
import org.openapitools.server.model.ConversionTagsList200Response
import org.openapitools.server.model.Error
import org.openapitools.server.model.PageVisitConversionTagsGet200Response


class ConversionTagsApi(
    conversionTagsService: ConversionTagsApiService,
    conversionTagsMarshaller: ConversionTagsApiMarshaller
) {

  import ConversionTagsApiPatterns.conversionTagIdPattern
import ConversionTagsApiPatterns.adAccountIdPattern

  import conversionTagsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "conversion_tags") { (adAccountId) => 
      post {  
            entity(as[ConversionTagCreate]){ conversionTagCreate =>
              conversionTagsService.conversionTagsCreate(adAccountId = adAccountId, conversionTagCreate = conversionTagCreate)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "conversion_tags" / conversionTagIdPattern) { (adAccountId, conversionTagId) => 
      get {  
            conversionTagsService.conversionTagsGet(adAccountId = adAccountId, conversionTagId = conversionTagId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "conversion_tags") { (adAccountId) => 
      get { 
        parameters("filter_deleted".as[Boolean].?(false)) { (filterDeleted) => 
            conversionTagsService.conversionTagsList(adAccountId = adAccountId, filterDeleted = filterDeleted)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "conversion_tags" / "ocpm_eligible") { (adAccountId) => 
      get {  
            conversionTagsService.ocpmEligibleConversionTagsGet(adAccountId = adAccountId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "conversion_tags" / "page_visit") { (adAccountId) => 
      get { 
        parameters("page_size".as[Int].?(25), "order".as[String].?, "bookmark".as[String].?) { (pageSize, order, bookmark) => 
            conversionTagsService.pageVisitConversionTagsGet(adAccountId = adAccountId, pageSize = pageSize, order = order, bookmark = bookmark)
        }
      }
    }
}

object ConversionTagsApiPatterns {

    val conversionTagIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait ConversionTagsApiService {

  def conversionTagsCreate200(responseConversionTag: ConversionTag)(implicit toEntityMarshallerConversionTag: ToEntityMarshaller[ConversionTag]): Route =
    complete((200, responseConversionTag))
  def conversionTagsCreate201(responseConversionTag: ConversionTag)(implicit toEntityMarshallerConversionTag: ToEntityMarshaller[ConversionTag]): Route =
    complete((201, responseConversionTag))
  def conversionTagsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def conversionTagsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def conversionTagsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def conversionTagsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def conversionTagsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def conversionTagsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: ConversionTag
   * Code: 201, Message: Resource create operation completed successfully., DataType: ConversionTag
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def conversionTagsCreate(adAccountId: String, conversionTagCreate: ConversionTagCreate)
      (implicit toEntityMarshallerConversionTag: ToEntityMarshaller[ConversionTag], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def conversionTagsGet200(responseConversionTag: ConversionTag)(implicit toEntityMarshallerConversionTag: ToEntityMarshaller[ConversionTag]): Route =
    complete((200, responseConversionTag))
  def conversionTagsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: ConversionTag
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def conversionTagsGet(adAccountId: String, conversionTagId: String)
      (implicit toEntityMarshallerConversionTag: ToEntityMarshaller[ConversionTag], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def conversionTagsList200(responseConversionTagsList200Response: ConversionTagsList200Response)(implicit toEntityMarshallerConversionTagsList200Response: ToEntityMarshaller[ConversionTagsList200Response]): Route =
    complete((200, responseConversionTagsList200Response))
  def conversionTagsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def conversionTagsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def conversionTagsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def conversionTagsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def conversionTagsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def conversionTagsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: ConversionTagsList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def conversionTagsList(adAccountId: String, filterDeleted: Boolean)
      (implicit toEntityMarshallerConversionTagsList200Response: ToEntityMarshaller[ConversionTagsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def ocpmEligibleConversionTagsGet200(responseMapmap: Map[String, Seq[ConversionEventResponse]])(implicit toEntityMarshallerMapmap: ToEntityMarshaller[Map[String, Seq[ConversionEventResponse]]]): Route =
    complete((200, responseMapmap))
  def ocpmEligibleConversionTagsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Map[String, Seq[ConversionEventResponse]]
   * Code: 0, Message: Unexpected errors, DataType: Error
   */
  def ocpmEligibleConversionTagsGet(adAccountId: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def pageVisitConversionTagsGet200(responsePageVisitConversionTagsGet200Response: PageVisitConversionTagsGet200Response)(implicit toEntityMarshallerPageVisitConversionTagsGet200Response: ToEntityMarshaller[PageVisitConversionTagsGet200Response]): Route =
    complete((200, responsePageVisitConversionTagsGet200Response))
  def pageVisitConversionTagsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: PageVisitConversionTagsGet200Response
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def pageVisitConversionTagsGet(adAccountId: String, pageSize: Int, order: Option[String], bookmark: Option[String])
      (implicit toEntityMarshallerPageVisitConversionTagsGet200Response: ToEntityMarshaller[PageVisitConversionTagsGet200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait ConversionTagsApiMarshaller {
  implicit def fromEntityUnmarshallerConversionTagCreate: FromEntityUnmarshaller[ConversionTagCreate]



  implicit def toEntityMarshallerConversionTag: ToEntityMarshaller[ConversionTag]

  implicit def toEntityMarshallerConversionTagsList200Response: ToEntityMarshaller[ConversionTagsList200Response]

  implicit def toEntityMarshallerPageVisitConversionTagsGet200Response: ToEntityMarshaller[PageVisitConversionTagsGet200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

