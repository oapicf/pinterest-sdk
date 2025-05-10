package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdateInvitesResultsResponseArray_items_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class UpdateInvitesResultsResponseArrayItemsInner(
  exception: Option[InviteExceptionResponse],
  invite: Option[InviteBusinessRoleBinding]
)

object UpdateInvitesResultsResponseArrayItemsInner {
  implicit lazy val updateInvitesResultsResponseArrayItemsInnerJsonFormat: Format[UpdateInvitesResultsResponseArrayItemsInner] = Json.format[UpdateInvitesResultsResponseArrayItemsInner]
}

