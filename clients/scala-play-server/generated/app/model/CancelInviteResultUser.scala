package model

import play.api.libs.json._

/**
  * Metadata of the member/partner that has access to the asset.
  * @param email Email of the business member/partner.
  * @param id Unique identifier of the business member/partner.
  * @param username Username of the business member/partner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CancelInviteResultUser(
  email: Option[String],
  id: Option[String],
  username: Option[String]
)

object CancelInviteResultUser {
  implicit lazy val cancelInviteResultUserJsonFormat: Format[CancelInviteResultUser] = Json.format[CancelInviteResultUser]
}

