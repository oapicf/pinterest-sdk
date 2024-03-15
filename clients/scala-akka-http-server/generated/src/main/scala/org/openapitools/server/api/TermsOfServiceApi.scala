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

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait TermsOfServiceApiService {

  def termsOfServiceGet200(responseTermsOfService: TermsOfService)(implicit toEntityMarshallerTermsOfService: ToEntityMarshaller[TermsOfService]): Route =
    complete((200, responseTermsOfService))
  def termsOfServiceGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: TermsOfService
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def termsOfServiceGet(adAccountId: String, includeHtml: Boolean, tosType: Option[String])
      (implicit toEntityMarshallerTermsOfService: ToEntityMarshaller[TermsOfService], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait TermsOfServiceApiMarshaller {


  implicit def toEntityMarshallerTermsOfService: ToEntityMarshaller[TermsOfService]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

