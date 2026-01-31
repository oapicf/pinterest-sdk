package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.ConversionAccessTokenResponse
import org.openapitools.server.model.Error
import org.openapitools.server.model.OauthAccessTokenResponse


class OauthApi(
    oauthService: OauthApiService,
    oauthMarshaller: OauthApiMarshaller
) {

  
  import oauthMarshaller._

  lazy val route: Route =
    path("oauth" / "conversion_token") { 
      post {  
            oauthService.oauthConversionToken()
      }
    } ~
    path("oauth" / "token") { 
      post {  
          formFields("grant_type".as[String]) { (grantType) =>
            oauthService.oauthToken(grantType = grantType)
          }
      }
    } ~
    path("oauth" / "token" / "revoke") { 
      post {  
          formFields("token".as[String], "token_type_hint".as[String].?) { (token, tokenTypeHint) =>
            oauthService.tokenRevoke(token = token, tokenTypeHint = tokenTypeHint)
          }
      }
    }
}


trait OauthApiService {

  def oauthConversionToken200(responseConversionAccessTokenResponse: ConversionAccessTokenResponse)(implicit toEntityMarshallerConversionAccessTokenResponse: ToEntityMarshaller[ConversionAccessTokenResponse]): Route =
    complete((200, responseConversionAccessTokenResponse))
  def oauthConversionTokenDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: ConversionAccessTokenResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def oauthConversionToken()
      (implicit toEntityMarshallerConversionAccessTokenResponse: ToEntityMarshaller[ConversionAccessTokenResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

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

  def tokenRevoke200: Route =
    complete((200, "Successful token revocation. No content is returned."))
  def tokenRevoke401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def tokenRevoke403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def tokenRevokeDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Successful token revocation. No content is returned.
   * Code: 401, Message: Client authentication error., DataType: Error
   * Code: 403, Message: Client is not allowed to revoke token., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def tokenRevoke(token: String, tokenTypeHint: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait OauthApiMarshaller {


  implicit def toEntityMarshallerOauthAccessTokenResponse: ToEntityMarshaller[OauthAccessTokenResponse]

  implicit def toEntityMarshallerConversionAccessTokenResponse: ToEntityMarshaller[ConversionAccessTokenResponse]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

