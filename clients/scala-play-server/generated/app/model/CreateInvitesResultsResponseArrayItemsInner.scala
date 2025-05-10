package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateInvitesResultsResponseArray_items_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CreateInvitesResultsResponseArrayItemsInner(
  exception: Option[InviteExceptionResponse],
  invite: Option[CreateInvitesResultsResponseArrayItemsInnerInvite]
)

object CreateInvitesResultsResponseArrayItemsInner {
  implicit lazy val createInvitesResultsResponseArrayItemsInnerJsonFormat: Format[CreateInvitesResultsResponseArrayItemsInner] = Json.format[CreateInvitesResultsResponseArrayItemsInner]
}

