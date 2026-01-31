package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadSubscriptionPostParamsCreateAllOfPartnerMetadata._

case class LeadSubscriptionPostParamsCreateAllOfPartnerMetadata (
  /* Text field value that uniquely identifies a subscriber. */
  subscriberKey: Option[String])

object LeadSubscriptionPostParamsCreateAllOfPartnerMetadata {
  import DateTimeCodecs._

  implicit val LeadSubscriptionPostParamsCreateAllOfPartnerMetadataCodecJson: CodecJson[LeadSubscriptionPostParamsCreateAllOfPartnerMetadata] = CodecJson.derive[LeadSubscriptionPostParamsCreateAllOfPartnerMetadata]
  implicit val LeadSubscriptionPostParamsCreateAllOfPartnerMetadataDecoder: EntityDecoder[LeadSubscriptionPostParamsCreateAllOfPartnerMetadata] = jsonOf[LeadSubscriptionPostParamsCreateAllOfPartnerMetadata]
  implicit val LeadSubscriptionPostParamsCreateAllOfPartnerMetadataEncoder: EntityEncoder[LeadSubscriptionPostParamsCreateAllOfPartnerMetadata] = jsonEncoderOf[LeadSubscriptionPostParamsCreateAllOfPartnerMetadata]
}
