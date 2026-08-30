package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Audience.
  * @param adAccountId Ad account ID.
  * @param audienceType [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
  * @param createdByCompanyName The company that created this audience.
  * @param createdTimestamp Creation time. Unix timestamp in seconds.
  * @param description Audience description.
  * @param id Audience ID.
  * @param isNca Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.
  * @param name Audience name.
  * @param size Audience size.
  * @param status Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
  * @param `type` Always \"audience\".
  * @param updatedTimestamp Last update time. Unix timestamp in seconds.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class Audience(
  adAccountId: Option[String],
  audienceType: Option[PinnerListType],
  createdByCompanyName: Option[String],
  createdTimestamp: Option[Int],
  description: Option[String],
  id: Option[String],
  isNca: Option[Boolean],
  name: Option[String],
  rule: Option[AudienceRule],
  size: Option[Int],
  status: Option[AudienceStatus],
  `type`: Option[String],
  updatedTimestamp: Option[Int]
)

object Audience {
  implicit lazy val audienceJsonFormat: Format[Audience] = Json.format[Audience]
}

