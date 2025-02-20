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

case class OauthAccessTokenRequestCode (
                  grantType:  Option[OauthAccessTokenRequestCodeGrantTypeEnum.OauthAccessTokenRequestCodeGrantTypeEnum],
                  code: String,
                  redirectUri: String
)

object OauthAccessTokenRequestCode {
implicit val format: Format[OauthAccessTokenRequestCode] = Json.format
}

object OauthAccessTokenRequestCodeGrantTypeEnum extends Enumeration {
  val   authorization_code, refresh_token, client_credentials = Value
  type OauthAccessTokenRequestCodeGrantTypeEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[OauthAccessTokenRequestCodeGrantTypeEnum.type])
}
