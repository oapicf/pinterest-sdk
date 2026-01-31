package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ad_accounts_audiences_shared_accounts_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdAccountsAudiencesSharedAccountsList200Response(
  items: List[SharedAudienceAccount],
  bookmark: Option[String]
)

object AdAccountsAudiencesSharedAccountsList200Response {
  implicit lazy val adAccountsAudiencesSharedAccountsList200ResponseJsonFormat: Format[AdAccountsAudiencesSharedAccountsList200Response] = Json.format[AdAccountsAudiencesSharedAccountsList200Response]
}

