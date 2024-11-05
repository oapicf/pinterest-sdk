package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdAccountCreateSubscriptionRequestPartnerMetadata._

case class AdAccountCreateSubscriptionRequestPartnerMetadata (
  /* Text field value that uniquely identifies a subscriber. */
  subscriberKey: Option[String])

object AdAccountCreateSubscriptionRequestPartnerMetadata {
  import DateTimeCodecs._

  implicit val AdAccountCreateSubscriptionRequestPartnerMetadataCodecJson: CodecJson[AdAccountCreateSubscriptionRequestPartnerMetadata] = CodecJson.derive[AdAccountCreateSubscriptionRequestPartnerMetadata]
  implicit val AdAccountCreateSubscriptionRequestPartnerMetadataDecoder: EntityDecoder[AdAccountCreateSubscriptionRequestPartnerMetadata] = jsonOf[AdAccountCreateSubscriptionRequestPartnerMetadata]
  implicit val AdAccountCreateSubscriptionRequestPartnerMetadataEncoder: EntityEncoder[AdAccountCreateSubscriptionRequestPartnerMetadata] = jsonEncoderOf[AdAccountCreateSubscriptionRequestPartnerMetadata]
}
