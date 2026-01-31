package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RespondToInvitesResponseArray_items_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RespondToInvitesResponseArrayItemsInner(
  exception: Option[InviteExceptionResponse],
  invite: Option[BaseInviteDataResponse]
)

object RespondToInvitesResponseArrayItemsInner {
  implicit lazy val respondToInvitesResponseArrayItemsInnerJsonFormat: Format[RespondToInvitesResponseArrayItemsInner] = Json.format[RespondToInvitesResponseArrayItemsInner]
}

