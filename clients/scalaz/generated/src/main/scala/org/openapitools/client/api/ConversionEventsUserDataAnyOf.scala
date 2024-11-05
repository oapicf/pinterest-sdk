package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionEventsUserDataAnyOf._

case class ConversionEventsUserDataAnyOf (
  /* Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. */
  em: List[String],
/* Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. */
  hashedMaids: Option[List[String]],
/* The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. */
  clientIpAddress: Option[String],
/* The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. */
  clientUserAgent: Option[String])

object ConversionEventsUserDataAnyOf {
  import DateTimeCodecs._

  implicit val ConversionEventsUserDataAnyOfCodecJson: CodecJson[ConversionEventsUserDataAnyOf] = CodecJson.derive[ConversionEventsUserDataAnyOf]
  implicit val ConversionEventsUserDataAnyOfDecoder: EntityDecoder[ConversionEventsUserDataAnyOf] = jsonOf[ConversionEventsUserDataAnyOf]
  implicit val ConversionEventsUserDataAnyOfEncoder: EntityEncoder[ConversionEventsUserDataAnyOf] = jsonEncoderOf[ConversionEventsUserDataAnyOf]
}
