package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SharedAudienceAccount.
  * @param accountId Account ID (ad account or business ID).
  * @param accountName Account name.
  * @param accountType account type
  * @param sharedOnTimestamp Epoch timestamp in seconds for the shared audience event
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class SharedAudienceAccount(
  accountId: String,
  accountName: String,
  accountType: SharedAudienceAccount.AccountType.Value,
  sharedOnTimestamp: Int
)

object SharedAudienceAccount {
  implicit lazy val sharedAudienceAccountJsonFormat: Format[SharedAudienceAccount] = Json.format[SharedAudienceAccount]

  // noinspection TypeAnnotation
  object AccountType extends Enumeration {
    val ADACCOUNT = Value("AD_ACCOUNT")
    val BUSINESSACCOUNT = Value("BUSINESS_ACCOUNT")

    type AccountType = Value
    implicit lazy val AccountTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

