package model

import play.api.libs.json._

/**
  * Response to delete invites sent to Members or Partners, if there is an exception, return the exception mapped with the invite id
  * @param items List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class DeleteInvitesResultsResponseArray(
  items: Option[List[DeleteInvitesResultsResponseArrayItemsInner]]
)

object DeleteInvitesResultsResponseArray {
  implicit lazy val deleteInvitesResultsResponseArrayJsonFormat: Format[DeleteInvitesResultsResponseArray] = Json.format[DeleteInvitesResultsResponseArray]
}

