package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param adAccountId Ad account ID.
  * @param audienceType [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
  * @param description Audience description.
  * @param name Audience name.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdAccountsAudienceCreate(
  adAccountId: Option[String],
  audienceType: Option[AudienceType],
  description: Option[String],
  name: Option[String],
  rule: Option[AdAccountsAudienceRule]
)

object AdAccountsAudienceCreate {
  implicit lazy val adAccountsAudienceCreateJsonFormat: Format[AdAccountsAudienceCreate] = Json.format[AdAccountsAudienceCreate]
}

