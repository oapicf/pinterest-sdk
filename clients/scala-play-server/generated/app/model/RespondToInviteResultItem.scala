package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RespondToInviteResultItem.
  * @param invite An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class RespondToInviteResultItem(
  exception: Option[InviteExceptionResponse],
  invite: Option[BaseInviteDataResponse]
)

object RespondToInviteResultItem {
  implicit lazy val respondToInviteResultItemJsonFormat: Format[RespondToInviteResultItem] = Json.format[RespondToInviteResultItem]
}

