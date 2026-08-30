package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdAccount._

case class AdAccount (
  country: Option[Country],
/*  Creation time. Unix timestamp in seconds. */
  createdTime: Option[Integer],
currency: Option[Currency],
id: String,
/* Ad account name. */
  name: Option[String],
/* Ad account owner */
  owner: Option[AdAccountOwner],
permissions: Option[List[BusinessAccessRole]],
/* The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. */
  timeZone: Option[String],
updatedTime: Option[Integer])

object AdAccount {
  import DateTimeCodecs._

  implicit val AdAccountCodecJson: CodecJson[AdAccount] = CodecJson.derive[AdAccount]
  implicit val AdAccountDecoder: EntityDecoder[AdAccount] = jsonOf[AdAccount]
  implicit val AdAccountEncoder: EntityEncoder[AdAccount] = jsonEncoderOf[AdAccount]
}
