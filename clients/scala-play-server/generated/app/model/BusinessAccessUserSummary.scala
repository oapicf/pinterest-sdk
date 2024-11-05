package model

import play.api.libs.json._

/**
  * Metadata of the member/partner that has access to the asset.
  * @param email Email of the business member/partner.
  * @param id Unique identifier of the business member/partner.
  * @param username Username of the business member/partner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class BusinessAccessUserSummary(
  email: Option[String],
  id: Option[String],
  username: Option[String]
)

object BusinessAccessUserSummary {
  implicit lazy val businessAccessUserSummaryJsonFormat: Format[BusinessAccessUserSummary] = Json.format[BusinessAccessUserSummary]
}

