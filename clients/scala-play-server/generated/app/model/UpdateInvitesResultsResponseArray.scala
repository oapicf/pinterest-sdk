package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdateInvitesResultsResponseArray.
  * @param items List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class UpdateInvitesResultsResponseArray(
  items: Option[List[UpdateInvitesResultsResponseArrayItemsInner]]
)

object UpdateInvitesResultsResponseArray {
  implicit lazy val updateInvitesResultsResponseArrayJsonFormat: Format[UpdateInvitesResultsResponseArray] = Json.format[UpdateInvitesResultsResponseArray]
}

