package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomerListRequest._

case class CustomerListRequest (
  /* Customer list name. */
  name: String,
/* Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. */
  records: String,
listType: Option[UserListType],
/* Customer list errors. */
  exceptions: Option[Any])

object CustomerListRequest {
  import DateTimeCodecs._

  implicit val CustomerListRequestCodecJson: CodecJson[CustomerListRequest] = CodecJson.derive[CustomerListRequest]
  implicit val CustomerListRequestDecoder: EntityDecoder[CustomerListRequest] = jsonOf[CustomerListRequest]
  implicit val CustomerListRequestEncoder: EntityEncoder[CustomerListRequest] = jsonEncoderOf[CustomerListRequest]
}
