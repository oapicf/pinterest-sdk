package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdateInvitesResultsResponseArray_items_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UpdateInvitesResultsResponseArrayItemsInner(
  exception: Option[InviteExceptionResponse],
  invite: Option[InviteBusinessRoleBinding]
)

object UpdateInvitesResultsResponseArrayItemsInner {
  implicit lazy val updateInvitesResultsResponseArrayItemsInnerJsonFormat: Format[UpdateInvitesResultsResponseArrayItemsInner] = Json.format[UpdateInvitesResultsResponseArrayItemsInner]
}

