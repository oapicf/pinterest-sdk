package model

import play.api.libs.json._

/**
  * The ID of the ad account.
  * @param adAccountId The ID of the ad account.
  * @param hasAccepted Whether the ad account has accepted terms of service.
  * @param html The terms of service content
  * @param id The ID of the terms of service
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TermsOfService(
  adAccountId: Option[String],
  hasAccepted: Option[Boolean],
  html: Option[String],
  id: Option[String]
)

object TermsOfService {
  implicit lazy val termsOfServiceJsonFormat: Format[TermsOfService] = Json.format[TermsOfService]
}

