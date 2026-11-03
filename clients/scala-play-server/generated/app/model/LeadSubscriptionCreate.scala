package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadSubscriptionCreate.
  * @param leadFormId Lead form ID.
  * @param webhookUrl Standard HTTPS webhook URL.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LeadSubscriptionCreate(
  leadFormId: Option[String],
  webhookUrl: String
)

object LeadSubscriptionCreate {
  implicit lazy val leadSubscriptionCreateJsonFormat: Format[LeadSubscriptionCreate] = Json.format[LeadSubscriptionCreate]
}

