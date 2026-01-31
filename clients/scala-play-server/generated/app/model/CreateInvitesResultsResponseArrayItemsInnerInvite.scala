package model

import play.api.libs.json._

/**
  * An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.
  * @param id Unique identifier of the invite/request.
  * @param user Metadata for the member/partner that was sent the invite/request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateInvitesResultsResponseArrayItemsInnerInvite(
  id: Option[String],
  user: Option[BusinessAccessUserSummary]
)

object CreateInvitesResultsResponseArrayItemsInnerInvite {
  implicit lazy val createInvitesResultsResponseArrayItemsInnerInviteJsonFormat: Format[CreateInvitesResultsResponseArrayItemsInnerInvite] = Json.format[CreateInvitesResultsResponseArrayItemsInnerInvite]
}

