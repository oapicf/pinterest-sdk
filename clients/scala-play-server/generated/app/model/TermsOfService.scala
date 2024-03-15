package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TermsOfService.
  * @param id The ID of the terms of service
  * @param html The terms of service content
  * @param hasAccepted Whether the ad account has accepted terms of service.
  * @param adAccountId The ID of the ad account.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class TermsOfService(
  id: Option[String],
  html: Option[String],
  hasAccepted: Option[Boolean],
  adAccountId: Option[String]
)

object TermsOfService {
  implicit lazy val termsOfServiceJsonFormat: Format[TermsOfService] = Json.format[TermsOfService]
}

