package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdateInvitesResultsResponseArray.
  * @param items List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UpdateInvitesResultsResponseArray(
  items: Option[List[UpdateInvitesResultsResponseArrayItemsInner]]
)

object UpdateInvitesResultsResponseArray {
  implicit lazy val updateInvitesResultsResponseArrayJsonFormat: Format[UpdateInvitesResultsResponseArray] = Json.format[UpdateInvitesResultsResponseArray]
}

