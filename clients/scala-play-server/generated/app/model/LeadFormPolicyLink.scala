package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadFormPolicyLink.
  * @param label Policy label for an additional policy link.
  * @param link Policy link for an additional policy link.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LeadFormPolicyLink(
  label: Option[String],
  link: Option[String]
)

object LeadFormPolicyLink {
  implicit lazy val leadFormPolicyLinkJsonFormat: Format[LeadFormPolicyLink] = Json.format[LeadFormPolicyLink]
}

