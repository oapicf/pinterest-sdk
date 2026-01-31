package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AmazonConnectRequest._

case class AmazonConnectRequest (
  /* The Amazon storefront id */
  amazonStorefrontId: Option[String],
/* The Amazon storefront name */
  amazonStorefrontName: String,
/* The Amazon storefront url */
  amazonStorefrontUrl: String,
/* The Amazon user id */
  amazonUserId: Option[String],
/* The Amazon account linking status */
  isAmazonAccountLinked: Boolean,
/* The one time passcode for Pinterest-initiated linking requests */
  oneTimePasscode: Option[String],
/* The Pinterest user id for Amazon-initiated linking requests */
  pinterestUserId: Option[String])

object AmazonConnectRequest {
  import DateTimeCodecs._

  implicit val AmazonConnectRequestCodecJson: CodecJson[AmazonConnectRequest] = CodecJson.derive[AmazonConnectRequest]
  implicit val AmazonConnectRequestDecoder: EntityDecoder[AmazonConnectRequest] = jsonOf[AmazonConnectRequest]
  implicit val AmazonConnectRequestEncoder: EntityEncoder[AmazonConnectRequest] = jsonEncoderOf[AmazonConnectRequest]
}
