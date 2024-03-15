package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdsCreditRedeemRequest.
  * @param offerCodeHash Takes in a SHA256 hash of the offerCode.
  * @param validateOnly If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AdsCreditRedeemRequest(
  offerCodeHash: String,
  validateOnly: Boolean
)

object AdsCreditRedeemRequest {
  implicit lazy val adsCreditRedeemRequestJsonFormat: Format[AdsCreditRedeemRequest] = Json.format[AdsCreditRedeemRequest]
}

