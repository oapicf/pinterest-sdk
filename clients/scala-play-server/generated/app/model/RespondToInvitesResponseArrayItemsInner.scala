package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RespondToInvitesResponseArray_items_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class RespondToInvitesResponseArrayItemsInner(
  exception: Option[InviteExceptionResponse],
  invite: Option[BaseInviteDataResponse]
)

object RespondToInvitesResponseArrayItemsInner {
  implicit lazy val respondToInvitesResponseArrayItemsInnerJsonFormat: Format[RespondToInvitesResponseArrayItemsInner] = Json.format[RespondToInvitesResponseArrayItemsInner]
}

