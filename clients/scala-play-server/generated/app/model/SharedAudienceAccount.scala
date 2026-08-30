package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SharedAudienceAccount.
  * @param accountId Account ID (ad account or business ID).
  * @param accountName Account name.
  * @param accountType account type
  * @param sharedOnTimestamp Epoch timestamp in seconds for the shared audience event
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class SharedAudienceAccount(
  accountId: String,
  accountName: String,
  accountType: AudienceAccountType,
  sharedOnTimestamp: Int
)

object SharedAudienceAccount {
  implicit lazy val sharedAudienceAccountJsonFormat: Format[SharedAudienceAccount] = Json.format[SharedAudienceAccount]
}

