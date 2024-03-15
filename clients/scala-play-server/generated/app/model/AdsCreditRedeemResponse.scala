package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdsCreditRedeemResponse.
  * @param success Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
  * @param errorCode Error code type if error occurs
  * @param errorMessage Reason for failure
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AdsCreditRedeemResponse(
  success: Option[Boolean],
  errorCode: Option[Int],
  errorMessage: Option[String]
)

object AdsCreditRedeemResponse {
  implicit lazy val adsCreditRedeemResponseJsonFormat: Format[AdsCreditRedeemResponse] = Json.format[AdsCreditRedeemResponse]
}

