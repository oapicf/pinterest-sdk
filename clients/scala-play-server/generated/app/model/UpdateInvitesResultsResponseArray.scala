package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdateInvitesResultsResponseArray.
  * @param items List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class UpdateInvitesResultsResponseArray(
  items: Option[List[InviteActionResultItem]]
)

object UpdateInvitesResultsResponseArray {
  implicit lazy val updateInvitesResultsResponseArrayJsonFormat: Format[UpdateInvitesResultsResponseArray] = Json.format[UpdateInvitesResultsResponseArray]
}

