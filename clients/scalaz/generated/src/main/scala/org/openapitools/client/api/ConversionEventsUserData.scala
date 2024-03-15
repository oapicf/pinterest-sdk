package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionEventsUserData._

case class ConversionEventsUserData (
  /* Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. */
  ph: Option[List[String]],
/* Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. */
  ge: Option[List[String]],
/* Sha256 hashes of user's date of birthday, given as year, month, and day. */
  db: Option[List[String]],
/* Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. */
  ln: Option[List[String]],
/* Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. */
  fn: Option[List[String]],
/* Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). */
  ct: Option[List[String]],
/* Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). */
  st: Option[List[String]],
/* Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). */
  zp: Option[List[String]],
/* Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. */
  country: Option[List[String]],
/* Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. */
  externalId: Option[List[String]],
/* The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. */
  clickId: Option[String],
/* A unique identifier of visitors' information defined by third party partners. e.g RampID */
  partnerId: Option[String])

object ConversionEventsUserData {
  import DateTimeCodecs._

  implicit val ConversionEventsUserDataCodecJson: CodecJson[ConversionEventsUserData] = CodecJson.derive[ConversionEventsUserData]
  implicit val ConversionEventsUserDataDecoder: EntityDecoder[ConversionEventsUserData] = jsonOf[ConversionEventsUserData]
  implicit val ConversionEventsUserDataEncoder: EntityEncoder[ConversionEventsUserData] = jsonEncoderOf[ConversionEventsUserData]
}
