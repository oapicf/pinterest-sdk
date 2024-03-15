package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdAccountsSubscriptionsGetList200Response._

case class AdAccountsSubscriptionsGetList200Response (
  items: List[AdAccountGetSubscriptionResponse],
bookmark: Option[String])

object AdAccountsSubscriptionsGetList200Response {
  import DateTimeCodecs._

  implicit val AdAccountsSubscriptionsGetList200ResponseCodecJson: CodecJson[AdAccountsSubscriptionsGetList200Response] = CodecJson.derive[AdAccountsSubscriptionsGetList200Response]
  implicit val AdAccountsSubscriptionsGetList200ResponseDecoder: EntityDecoder[AdAccountsSubscriptionsGetList200Response] = jsonOf[AdAccountsSubscriptionsGetList200Response]
  implicit val AdAccountsSubscriptionsGetList200ResponseEncoder: EntityEncoder[AdAccountsSubscriptionsGetList200Response] = jsonEncoderOf[AdAccountsSubscriptionsGetList200Response]
}
