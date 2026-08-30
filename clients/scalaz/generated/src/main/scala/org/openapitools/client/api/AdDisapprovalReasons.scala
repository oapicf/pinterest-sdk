package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdDisapprovalReasons._

case class AdDisapprovalReasons (
  
object AdDisapprovalReasons {
  import DateTimeCodecs._

  implicit val AdDisapprovalReasonsCodecJson: CodecJson[AdDisapprovalReasons] = CodecJson.derive[AdDisapprovalReasons]
  implicit val AdDisapprovalReasonsDecoder: EntityDecoder[AdDisapprovalReasons] = jsonOf[AdDisapprovalReasons]
  implicit val AdDisapprovalReasonsEncoder: EntityEncoder[AdDisapprovalReasons] = jsonEncoderOf[AdDisapprovalReasons]
}
