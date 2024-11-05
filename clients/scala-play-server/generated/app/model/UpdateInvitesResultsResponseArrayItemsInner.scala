package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdateInvitesResultsResponseArray_items_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class UpdateInvitesResultsResponseArrayItemsInner(
  exception: Option[InviteExceptionResponse],
  invite: Option[InviteBusinessRoleBinding]
)

object UpdateInvitesResultsResponseArrayItemsInner {
  implicit lazy val updateInvitesResultsResponseArrayItemsInnerJsonFormat: Format[UpdateInvitesResultsResponseArrayItemsInner] = Json.format[UpdateInvitesResultsResponseArrayItemsInner]
}

