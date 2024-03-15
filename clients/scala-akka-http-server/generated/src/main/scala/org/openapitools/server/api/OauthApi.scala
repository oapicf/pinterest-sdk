package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Error
import org.openapitools.server.model.OauthAccessTokenResponse


class OauthApi(
    oauthService: OauthApiService,
    oauthMarshaller: OauthApiMarshaller
) {

  
  import oauthMarshaller._

  lazy val route: Route =
    path("oauth" / "token") { 
      post {  
          formFields("grant_type".as[String]) { (grantType) =>
            oauthService.oauthToken(grantType = grantType)
          }
      }
    }
}


trait OauthApiService {

  def oauthToken200(responseOauthAccessTokenResponse: OauthAccessTokenResponse)(implicit toEntityMarshallerOauthAccessTokenResponse: ToEntityMarshaller[OauthAccessTokenResponse]): Route =
    complete((200, responseOauthAccessTokenResponse))
  def oauthTokenDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: OauthAccessTokenResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def oauthToken(grantType: String)
      (implicit toEntityMarshallerOauthAccessTokenResponse: ToEntityMarshaller[OauthAccessTokenResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait OauthApiMarshaller {


  implicit def toEntityMarshallerOauthAccessTokenResponse: ToEntityMarshaller[OauthAccessTokenResponse]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

