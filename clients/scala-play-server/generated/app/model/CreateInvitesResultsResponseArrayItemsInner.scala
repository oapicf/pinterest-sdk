package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateInvitesResultsResponseArray_items_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateInvitesResultsResponseArrayItemsInner(
  exception: Option[InviteExceptionResponse],
  invite: Option[CreateInvitesResultsResponseArrayItemsInnerInvite]
)

object CreateInvitesResultsResponseArrayItemsInner {
  implicit lazy val createInvitesResultsResponseArrayItemsInnerJsonFormat: Format[CreateInvitesResultsResponseArrayItemsInner] = Json.format[CreateInvitesResultsResponseArrayItemsInner]
}

