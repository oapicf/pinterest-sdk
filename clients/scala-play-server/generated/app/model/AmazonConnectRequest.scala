package model

import play.api.libs.json._

/**
  * Request containing OTP and Amazon storefront info called by Amazon
  * @param amazonStorefrontId The Amazon storefront id
  * @param amazonStorefrontName The Amazon storefront name
  * @param amazonStorefrontUrl The Amazon storefront url
  * @param amazonUserId The Amazon user id
  * @param isAmazonAccountLinked The Amazon account linking status
  * @param oneTimePasscode The one time passcode for Pinterest-initiated linking requests
  * @param pinterestUserId The Pinterest user id for Amazon-initiated linking requests
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AmazonConnectRequest(
  amazonStorefrontId: Option[String],
  amazonStorefrontName: String,
  amazonStorefrontUrl: String,
  amazonUserId: Option[String],
  isAmazonAccountLinked: Boolean,
  oneTimePasscode: Option[String],
  pinterestUserId: Option[String]
)

object AmazonConnectRequest {
  implicit lazy val amazonConnectRequestJsonFormat: Format[AmazonConnectRequest] = Json.format[AmazonConnectRequest]
}

