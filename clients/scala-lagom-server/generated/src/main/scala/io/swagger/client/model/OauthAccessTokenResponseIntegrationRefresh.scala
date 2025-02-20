/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.swagger.client.model
import play.api.libs.json._

case class OauthAccessTokenResponseIntegrationRefresh (
                  responseType:  Option[OauthAccessTokenResponseIntegrationRefreshResponseTypeEnum.OauthAccessTokenResponseIntegrationRefreshResponseTypeEnum],
                  accessToken: String,
                  tokenType: String,
                  expiresIn: Int,
                  scope: String,
                  refreshToken: String,
                  refreshTokenExpiresIn: Int
)

object OauthAccessTokenResponseIntegrationRefresh {
implicit val format: Format[OauthAccessTokenResponseIntegrationRefresh] = Json.format
}

object OauthAccessTokenResponseIntegrationRefreshResponseTypeEnum extends Enumeration {
  val   authorization_code, refresh_token, client_credentials = Value
  type OauthAccessTokenResponseIntegrationRefreshResponseTypeEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[OauthAccessTokenResponseIntegrationRefreshResponseTypeEnum.type])
}
