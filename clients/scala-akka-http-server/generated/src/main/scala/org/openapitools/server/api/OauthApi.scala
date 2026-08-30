package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.ConversionAccessToken
import org.openapitools.server.model.Error
import org.openapitools.server.model.OauthAccessToken
import org.openapitools.server.model.TokenGrantType
import org.openapitools.server.model.TokenTypeHint


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
          formFields("code".as[String].?, "continuous_refresh".as[String].?, "grant_type".as[String], "redirect_uri".as[String].?, "refresh_token".as[String].?, "scope".as[String].?) { (code, continuousRefresh, grantType, redirectUri, refreshToken, scope) =>
            oauthService.oauthToken(grantType = grantType, code = code, continuousRefresh = continuousRefresh, redirectUri = redirectUri, refreshToken = refreshToken, scope = scope)
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

  def oauthConversionToken200(responseConversionAccessToken: ConversionAccessToken)(implicit toEntityMarshallerConversionAccessToken: ToEntityMarshaller[ConversionAccessToken]): Route =
    complete((200, responseConversionAccessToken))
  def oauthConversionToken400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def oauthConversionToken401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def oauthConversionToken403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def oauthConversionToken404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def oauthConversionToken429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def oauthConversionTokenDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: ConversionAccessToken
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def oauthConversionToken()
      (implicit toEntityMarshallerConversionAccessToken: ToEntityMarshaller[ConversionAccessToken], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def oauthToken200(responseOauthAccessToken: OauthAccessToken)(implicit toEntityMarshallerOauthAccessToken: ToEntityMarshaller[OauthAccessToken]): Route =
    complete((200, responseOauthAccessToken))
  def oauthToken201(responseOauthAccessToken: OauthAccessToken)(implicit toEntityMarshallerOauthAccessToken: ToEntityMarshaller[OauthAccessToken]): Route =
    complete((201, responseOauthAccessToken))
  def oauthToken400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def oauthToken401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def oauthToken403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def oauthToken404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def oauthToken429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def oauthTokenDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: OauthAccessToken
   * Code: 201, Message: Resource create operation completed successfully., DataType: OauthAccessToken
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def oauthToken(grantType: TokenGrantType, code: Option[String], continuousRefresh: Option[String], redirectUri: Option[String], refreshToken: Option[String], scope: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerOauthAccessToken: ToEntityMarshaller[OauthAccessToken]): Route

  def tokenRevoke200: Route =
    complete((200, "The request has succeeded."))
  def tokenRevoke401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def tokenRevoke403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def tokenRevokeDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded.
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def tokenRevoke(token: String, tokenTypeHint: Option[TokenTypeHint])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait OauthApiMarshaller {
  implicit def fromEntityUnmarshallerTokenGrantType: FromEntityUnmarshaller[TokenGrantType]

  implicit def fromEntityUnmarshallerTokenTypeHint: FromEntityUnmarshaller[TokenTypeHint]



  implicit def toEntityMarshallerConversionAccessToken: ToEntityMarshaller[ConversionAccessToken]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerOauthAccessToken: ToEntityMarshaller[OauthAccessToken]

}

