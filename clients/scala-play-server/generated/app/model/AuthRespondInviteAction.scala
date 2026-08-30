package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AuthRespondInviteAction.
  * @param acceptInvite Whether the invite/request is accepted.
  * @param assetIdToPermissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AuthRespondInviteAction(
  acceptInvite: Boolean,
  assetIdToPermissions: Option[Map[String, List[Permissions]]],
)

object AuthRespondInviteAction {
  implicit lazy val authRespondInviteActionJsonFormat: Format[AuthRespondInviteAction] = Json.format[AuthRespondInviteAction]
}

