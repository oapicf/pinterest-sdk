package model

import play.api.libs.json._

/**
  * Resource create or update operation model.
  * @param adAccountId Ad account ID.
  * @param audienceType [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
  * @param description Audience description.
  * @param name Audience name.
  * @param operationType Audience operation type (update or remove). Only valid in update request body.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdAccountsAudienceUpdate(
  adAccountId: Option[String],
  audienceType: Option[AudienceType],
  description: Option[String],
  name: Option[String],
  operationType: Option[AudienceUpdateOperationType],
  rule: Option[AdAccountsAudienceRule]
)

object AdAccountsAudienceUpdate {
  implicit lazy val adAccountsAudienceUpdateJsonFormat: Format[AdAccountsAudienceUpdate] = Json.format[AdAccountsAudienceUpdate]
}

