package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadSubscriptionCreate.
  * @param leadFormId Lead form ID.
  * @param webhookUrl Standard HTTPS webhook URL.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LeadSubscriptionCreate(
  leadFormId: Option[String],
  webhookUrl: String
)

object LeadSubscriptionCreate {
  implicit lazy val leadSubscriptionCreateJsonFormat: Format[LeadSubscriptionCreate] = Json.format[LeadSubscriptionCreate]
}

