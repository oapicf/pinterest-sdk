package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RespondToInvitesResponseArray.
  * @param items List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class RespondToInvitesResponseArray(
  items: Option[List[RespondToInvitesResponseArrayItemsInner]]
)

object RespondToInvitesResponseArray {
  implicit lazy val respondToInvitesResponseArrayJsonFormat: Format[RespondToInvitesResponseArray] = Json.format[RespondToInvitesResponseArray]
}

