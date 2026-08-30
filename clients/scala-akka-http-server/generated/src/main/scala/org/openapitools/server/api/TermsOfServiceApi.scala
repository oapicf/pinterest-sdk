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
import org.openapitools.server.model.TermsOfService


class TermsOfServiceApi(
    termsOfServiceService: TermsOfServiceApiService,
    termsOfServiceMarshaller: TermsOfServiceApiMarshaller
) {

  import TermsOfServiceApiPatterns.adAccountIdPattern

  import termsOfServiceMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "terms_of_service") { (adAccountId) => 
      get { 
        parameters("include_html".as[Boolean].?(false), "tos_type".as[String].?) { (includeHtml, tosType) => 
            termsOfServiceService.termsOfServiceGet(adAccountId = adAccountId, includeHtml = includeHtml, tosType = tosType)
        }
      }
    }
}

object TermsOfServiceApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait TermsOfServiceApiService {

  def termsOfServiceGet200(responseTermsOfService: TermsOfService)(implicit toEntityMarshallerTermsOfService: ToEntityMarshaller[TermsOfService]): Route =
    complete((200, responseTermsOfService))
  def termsOfServiceGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def termsOfServiceGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def termsOfServiceGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def termsOfServiceGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def termsOfServiceGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def termsOfServiceGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: TermsOfService
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def termsOfServiceGet(adAccountId: String, includeHtml: Boolean, tosType: Option[String])
      (implicit toEntityMarshallerTermsOfService: ToEntityMarshaller[TermsOfService], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait TermsOfServiceApiMarshaller {


  implicit def toEntityMarshallerTermsOfService: ToEntityMarshaller[TermsOfService]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

