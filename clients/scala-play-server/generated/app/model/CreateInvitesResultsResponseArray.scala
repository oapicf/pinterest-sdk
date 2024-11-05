package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateInvitesResultsResponseArray.
  * @param items List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateInvitesResultsResponseArray(
  items: Option[List[CreateInvitesResultsResponseArrayItemsInner]]
)

object CreateInvitesResultsResponseArray {
  implicit lazy val createInvitesResultsResponseArrayJsonFormat: Format[CreateInvitesResultsResponseArray] = Json.format[CreateInvitesResultsResponseArray]
}

