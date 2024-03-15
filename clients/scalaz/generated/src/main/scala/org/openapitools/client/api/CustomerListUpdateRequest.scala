package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomerListUpdateRequest._

case class CustomerListUpdateRequest (
  /* Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. */
  records: String,
operationType: UserListOperationType,
exceptions: Option[Exception])

object CustomerListUpdateRequest {
  import DateTimeCodecs._

  implicit val CustomerListUpdateRequestCodecJson: CodecJson[CustomerListUpdateRequest] = CodecJson.derive[CustomerListUpdateRequest]
  implicit val CustomerListUpdateRequestDecoder: EntityDecoder[CustomerListUpdateRequest] = jsonOf[CustomerListUpdateRequest]
  implicit val CustomerListUpdateRequestEncoder: EntityEncoder[CustomerListUpdateRequest] = jsonEncoderOf[CustomerListUpdateRequest]
}
