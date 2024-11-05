package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadFormCommon_policy_links_inner.
  * @param label Policy label for an additional policy link.
  * @param link Policy link for an additional policy link.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class LeadFormCommonPolicyLinksInner(
  label: Option[String],
  link: Option[String]
)

object LeadFormCommonPolicyLinksInner {
  implicit lazy val leadFormCommonPolicyLinksInnerJsonFormat: Format[LeadFormCommonPolicyLinksInner] = Json.format[LeadFormCommonPolicyLinksInner]
}

