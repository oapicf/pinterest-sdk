package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BusinessToAdAccountSharedAudience.
  * @param audienceId Unique identifier of an audience
  * @param permissions Permissions granted to the recipients.
  * @param recipientAccountIds Ad account IDs to share with or revoke from (request) / that received the audience (response).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BusinessToAdAccountSharedAudience(
  audienceId: String,
  permissions: Option[List[Role]],
  recipientAccountIds: List[String]
)

object BusinessToAdAccountSharedAudience {
  implicit lazy val businessToAdAccountSharedAudienceJsonFormat: Format[BusinessToAdAccountSharedAudience] = Json.format[BusinessToAdAccountSharedAudience]
}

