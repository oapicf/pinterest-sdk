package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param offerCodeHash Takes in a SHA256 hash of the offerCode.
  * @param validateOnly If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdsCreditRedeemCreate(
  offerCodeHash: String,
  validateOnly: Boolean
)

object AdsCreditRedeemCreate {
  implicit lazy val adsCreditRedeemCreateJsonFormat: Format[AdsCreditRedeemCreate] = Json.format[AdsCreditRedeemCreate]
}

