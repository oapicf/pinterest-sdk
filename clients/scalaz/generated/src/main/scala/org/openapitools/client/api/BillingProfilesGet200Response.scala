package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BillingProfilesGet200Response._

case class BillingProfilesGet200Response (
  items: List[BillingProfilesResponse],
bookmark: Option[String])

object BillingProfilesGet200Response {
  import DateTimeCodecs._

  implicit val BillingProfilesGet200ResponseCodecJson: CodecJson[BillingProfilesGet200Response] = CodecJson.derive[BillingProfilesGet200Response]
  implicit val BillingProfilesGet200ResponseDecoder: EntityDecoder[BillingProfilesGet200Response] = jsonOf[BillingProfilesGet200Response]
  implicit val BillingProfilesGet200ResponseEncoder: EntityEncoder[BillingProfilesGet200Response] = jsonEncoderOf[BillingProfilesGet200Response]
}
