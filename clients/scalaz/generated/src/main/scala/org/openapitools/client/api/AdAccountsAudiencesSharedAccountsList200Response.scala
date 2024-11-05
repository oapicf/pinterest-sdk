package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdAccountsAudiencesSharedAccountsList200Response._

case class AdAccountsAudiencesSharedAccountsList200Response (
  items: List[SharedAudienceAccount],
bookmark: Option[String])

object AdAccountsAudiencesSharedAccountsList200Response {
  import DateTimeCodecs._

  implicit val AdAccountsAudiencesSharedAccountsList200ResponseCodecJson: CodecJson[AdAccountsAudiencesSharedAccountsList200Response] = CodecJson.derive[AdAccountsAudiencesSharedAccountsList200Response]
  implicit val AdAccountsAudiencesSharedAccountsList200ResponseDecoder: EntityDecoder[AdAccountsAudiencesSharedAccountsList200Response] = jsonOf[AdAccountsAudiencesSharedAccountsList200Response]
  implicit val AdAccountsAudiencesSharedAccountsList200ResponseEncoder: EntityEncoder[AdAccountsAudiencesSharedAccountsList200Response] = jsonEncoderOf[AdAccountsAudiencesSharedAccountsList200Response]
}
