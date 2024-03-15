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
import org.openapitools.server.model.ConversionTagCreate
import org.openapitools.server.model.ConversionTagListResponse
import org.openapitools.server.model.ConversionTagResponse
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

  def conversionTagsCreate200(responseConversionTagResponse: ConversionTagResponse)(implicit toEntityMarshallerConversionTagResponse: ToEntityMarshaller[ConversionTagResponse]): Route =
    complete((200, responseConversionTagResponse))
  def conversionTagsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: ConversionTagResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def conversionTagsCreate(adAccountId: String, conversionTagCreate: ConversionTagCreate)
      (implicit toEntityMarshallerConversionTagResponse: ToEntityMarshaller[ConversionTagResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def conversionTagsGet200(responseConversionTagResponse: ConversionTagResponse)(implicit toEntityMarshallerConversionTagResponse: ToEntityMarshaller[ConversionTagResponse]): Route =
    complete((200, responseConversionTagResponse))
  def conversionTagsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: ConversionTagResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def conversionTagsGet(adAccountId: String, conversionTagId: String)
      (implicit toEntityMarshallerConversionTagResponse: ToEntityMarshaller[ConversionTagResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def conversionTagsList200(responseConversionTagListResponse: ConversionTagListResponse)(implicit toEntityMarshallerConversionTagListResponse: ToEntityMarshaller[ConversionTagListResponse]): Route =
    complete((200, responseConversionTagListResponse))
  def conversionTagsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: ConversionTagListResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def conversionTagsList(adAccountId: String, filterDeleted: Boolean)
      (implicit toEntityMarshallerConversionTagListResponse: ToEntityMarshaller[ConversionTagListResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

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



  implicit def toEntityMarshallerConversionTagResponse: ToEntityMarshaller[ConversionTagResponse]

  implicit def toEntityMarshallerPageVisitConversionTagsGet200Response: ToEntityMarshaller[PageVisitConversionTagsGet200Response]

  implicit def toEntityMarshallerConversionTagListResponse: ToEntityMarshaller[ConversionTagListResponse]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

