package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import WebsiteVerificationMethod._

case class WebsiteVerificationMethod (
  
object WebsiteVerificationMethod {
  import DateTimeCodecs._

  implicit val WebsiteVerificationMethodCodecJson: CodecJson[WebsiteVerificationMethod] = CodecJson.derive[WebsiteVerificationMethod]
  implicit val WebsiteVerificationMethodDecoder: EntityDecoder[WebsiteVerificationMethod] = jsonOf[WebsiteVerificationMethod]
  implicit val WebsiteVerificationMethodEncoder: EntityEncoder[WebsiteVerificationMethod] = jsonEncoderOf[WebsiteVerificationMethod]
}
