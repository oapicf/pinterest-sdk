package model

import play.api.libs.json._

/**
  * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
  * @param inviteId Unique identifier of an invite.
  * @param message Error message associated with the error in performing the action on the invite/request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class DeleteInvitesResultsResponseArrayItemsInnerException(
  inviteId: Option[String],
  message: Option[String]
)

object DeleteInvitesResultsResponseArrayItemsInnerException {
  implicit lazy val deleteInvitesResultsResponseArrayItemsInnerExceptionJsonFormat: Format[DeleteInvitesResultsResponseArrayItemsInnerException] = Json.format[DeleteInvitesResultsResponseArrayItemsInnerException]
}

