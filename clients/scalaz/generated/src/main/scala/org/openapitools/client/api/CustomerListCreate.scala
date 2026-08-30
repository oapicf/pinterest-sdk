package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomerListCreate._

case class CustomerListCreate (
  /* Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. */
  isNca: Option[Boolean],
/* Type of customer list (e.g., EMAIL, IDFA, MAID). */
  listType: Option[UserListType],
/* Customer list name. */
  name: String,
/* Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. */
  records: Option[String],
/* Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2. */
  recordsV2: Option[List[CustomerListRecordRow]])

object CustomerListCreate {
  import DateTimeCodecs._

  implicit val CustomerListCreateCodecJson: CodecJson[CustomerListCreate] = CodecJson.derive[CustomerListCreate]
  implicit val CustomerListCreateDecoder: EntityDecoder[CustomerListCreate] = jsonOf[CustomerListCreate]
  implicit val CustomerListCreateEncoder: EntityEncoder[CustomerListCreate] = jsonEncoderOf[CustomerListCreate]
}
