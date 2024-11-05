package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TermsOfService.
  * @param id The ID of the terms of service
  * @param html The terms of service content
  * @param hasAccepted Whether the ad account has accepted terms of service.
  * @param adAccountId The ID of the ad account.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class TermsOfService(
  id: Option[String],
  html: Option[String],
  hasAccepted: Option[Boolean],
  adAccountId: Option[String]
)

object TermsOfService {
  implicit lazy val termsOfServiceJsonFormat: Format[TermsOfService] = Json.format[TermsOfService]
}

