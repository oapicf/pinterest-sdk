package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ad_accounts_audiences_shared_accounts_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdAccountsAudiencesSharedAccountsList200Response(
  items: List[SharedAudienceAccount],
  bookmark: Option[String]
)

object AdAccountsAudiencesSharedAccountsList200Response {
  implicit lazy val adAccountsAudiencesSharedAccountsList200ResponseJsonFormat: Format[AdAccountsAudiencesSharedAccountsList200Response] = Json.format[AdAccountsAudiencesSharedAccountsList200Response]
}

