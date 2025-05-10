package model

import play.api.libs.json._

/**
  * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
  * @param inviteId Unique identifier of an invite.
  * @param message Error message associated with the error in performing the action on the invite/request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class DeleteInvitesResultsResponseArrayItemsInnerException(
  inviteId: Option[String],
  message: Option[String]
)

object DeleteInvitesResultsResponseArrayItemsInnerException {
  implicit lazy val deleteInvitesResultsResponseArrayItemsInnerExceptionJsonFormat: Format[DeleteInvitesResultsResponseArrayItemsInnerException] = Json.format[DeleteInvitesResultsResponseArrayItemsInnerException]
}

