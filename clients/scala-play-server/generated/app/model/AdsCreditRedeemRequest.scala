package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdsCreditRedeemRequest.
  * @param offerCodeHash Takes in a SHA256 hash of the offerCode.
  * @param validateOnly If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdsCreditRedeemRequest(
  offerCodeHash: String,
  validateOnly: Boolean
)

object AdsCreditRedeemRequest {
  implicit lazy val adsCreditRedeemRequestJsonFormat: Format[AdsCreditRedeemRequest] = Json.format[AdsCreditRedeemRequest]
}

