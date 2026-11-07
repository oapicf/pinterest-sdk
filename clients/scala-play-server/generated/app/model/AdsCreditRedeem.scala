package model

import play.api.libs.json._

/**
  * Ads credit redemption
  * @param errorCode Error code type if error occurs
  * @param errorMessage Reason for failure
  * @param success Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdsCreditRedeem(
  errorCode: Option[Int],
  errorMessage: Option[String],
  success: Option[Boolean]
)

object AdsCreditRedeem {
  implicit lazy val adsCreditRedeemJsonFormat: Format[AdsCreditRedeem] = Json.format[AdsCreditRedeem]
}

