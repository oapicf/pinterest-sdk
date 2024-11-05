package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeleteInvitesResultsResponseArray_items_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class DeleteInvitesResultsResponseArrayItemsInner(
  exception: Option[DeleteInvitesResultsResponseArrayItemsInnerException],
  invite: Option[BaseInviteDataResponse]
)

object DeleteInvitesResultsResponseArrayItemsInner {
  implicit lazy val deleteInvitesResultsResponseArrayItemsInnerJsonFormat: Format[DeleteInvitesResultsResponseArrayItemsInner] = Json.format[DeleteInvitesResultsResponseArrayItemsInner]
}

