package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadFormPolicyLink.
  * @param label Policy label for an additional policy link.
  * @param link Policy link for an additional policy link.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LeadFormPolicyLink(
  label: Option[String],
  link: Option[String]
)

object LeadFormPolicyLink {
  implicit lazy val leadFormPolicyLinkJsonFormat: Format[LeadFormPolicyLink] = Json.format[LeadFormPolicyLink]
}

