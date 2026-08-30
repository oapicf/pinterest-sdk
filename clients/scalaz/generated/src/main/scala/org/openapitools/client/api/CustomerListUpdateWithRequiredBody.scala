package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomerListUpdateWithRequiredBody._

case class CustomerListUpdateWithRequiredBody (
  /* Customer list update operation type (add or remove). Only valid in update request body. */
  operationType: UserListOperationType,
/* Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. */
  records: Option[String],
/* Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2. */
  recordsV2: Option[List[CustomerListRecordRow]])

object CustomerListUpdateWithRequiredBody {
  import DateTimeCodecs._

  implicit val CustomerListUpdateWithRequiredBodyCodecJson: CodecJson[CustomerListUpdateWithRequiredBody] = CodecJson.derive[CustomerListUpdateWithRequiredBody]
  implicit val CustomerListUpdateWithRequiredBodyDecoder: EntityDecoder[CustomerListUpdateWithRequiredBody] = jsonOf[CustomerListUpdateWithRequiredBody]
  implicit val CustomerListUpdateWithRequiredBodyEncoder: EntityEncoder[CustomerListUpdateWithRequiredBody] = jsonEncoderOf[CustomerListUpdateWithRequiredBody]
}
