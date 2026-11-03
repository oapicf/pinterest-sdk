package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdAccountToAdAccountSharedAudience.
  * @param audienceId Unique identifier of an audience
  * @param permissions Permissions granted to the recipients.
  * @param recipientAccountIds Ad account IDs to share with or revoke from (request) / that received the audience (response).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdAccountToAdAccountSharedAudience(
  audienceId: String,
  permissions: Option[List[Role]],
  recipientAccountIds: List[String]
)

object AdAccountToAdAccountSharedAudience {
  implicit lazy val adAccountToAdAccountSharedAudienceJsonFormat: Format[AdAccountToAdAccountSharedAudience] = Json.format[AdAccountToAdAccountSharedAudience]
}

