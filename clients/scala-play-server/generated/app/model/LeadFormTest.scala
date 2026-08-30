package model

import play.api.libs.json._

/**
  * Lead form test action: submit sample answers and receive the resulting subscription id.
  * @param subscriptionId Subscription ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LeadFormTest(
  subscriptionId: Option[String]
)

object LeadFormTest {
  implicit lazy val leadFormTestJsonFormat: Format[LeadFormTest] = Json.format[LeadFormTest]
}

