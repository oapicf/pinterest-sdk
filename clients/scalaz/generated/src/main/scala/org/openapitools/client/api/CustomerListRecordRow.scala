package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomerListRecordRow._

case class CustomerListRecordRow (
  /* Email address (plain or hashed with SHA1, SHA256, or MD5). */
  email: Option[String],
/* External ID identifier (not hashed). */
  externalId: Option[String],
/* Hashed phone number (hashed with SHA1, SHA256, or MD5). */
  hashedPhoneNumber: Option[String],
/* Hashed pinner ID (hashed with SHA1, SHA256, or MD5). */
  hashedPinnerId: Option[String],
/* IP address (not hashed). */
  ipAddress: Option[String],
/* LiveRamp envelope identifier (Base64-encoded, not hashed). */
  liverampEnvelope: Option[String],
/* Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5). */
  maid: Option[String],
/* User agent string (not hashed). */
  userAgent: Option[String])

object CustomerListRecordRow {
  import DateTimeCodecs._

  implicit val CustomerListRecordRowCodecJson: CodecJson[CustomerListRecordRow] = CodecJson.derive[CustomerListRecordRow]
  implicit val CustomerListRecordRowDecoder: EntityDecoder[CustomerListRecordRow] = jsonOf[CustomerListRecordRow]
  implicit val CustomerListRecordRowEncoder: EntityEncoder[CustomerListRecordRow] = jsonEncoderOf[CustomerListRecordRow]
}
