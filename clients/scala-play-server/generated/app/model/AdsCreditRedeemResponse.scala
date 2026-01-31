package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdsCreditRedeemResponse.
  * @param errorCode Error code type if error occurs
  * @param errorMessage Reason for failure
  * @param success Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdsCreditRedeemResponse(
  errorCode: Option[Int],
  errorMessage: Option[String],
  success: Option[Boolean]
)

object AdsCreditRedeemResponse {
  implicit lazy val adsCreditRedeemResponseJsonFormat: Format[AdsCreditRedeemResponse] = Json.format[AdsCreditRedeemResponse]
}

