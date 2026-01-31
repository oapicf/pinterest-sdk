package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Audience.
  * @param adAccountId Ad account ID.
  * @param audienceType <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
  * @param createdByCompanyName The company that created this audience.
  * @param createdTimestamp Creation time. Unix timestamp in seconds.
  * @param description Audience description.
  * @param id Audience ID.
  * @param name Audience name.
  * @param size Audience size.
  * @param status Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
  * @param `type` Always \"audience\".
  * @param updatedTimestamp Last update time. Unix timestamp in seconds.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class Audience(
  adAccountId: Option[String],
  audienceType: Option[String],
  createdByCompanyName: Option[String],
  createdTimestamp: Option[Int],
  description: Option[String],
  id: Option[String],
  name: Option[String],
  rule: Option[AudienceRule],
  size: Option[Int],
  status: Option[String],
  `type`: Option[String],
  updatedTimestamp: Option[Int]
)

object Audience {
  implicit lazy val audienceJsonFormat: Format[Audience] = Json.format[Audience]
}

