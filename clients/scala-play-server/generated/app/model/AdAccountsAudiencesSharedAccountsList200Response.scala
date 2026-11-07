package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ad_accounts_audiences_shared_accounts_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdAccountsAudiencesSharedAccountsList200Response(
  bookmark: Option[String],
  items: List[SharedAudienceAccount]
)

object AdAccountsAudiencesSharedAccountsList200Response {
  implicit lazy val adAccountsAudiencesSharedAccountsList200ResponseJsonFormat: Format[AdAccountsAudiencesSharedAccountsList200Response] = Json.format[AdAccountsAudiencesSharedAccountsList200Response]
}

