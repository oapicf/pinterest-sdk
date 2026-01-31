package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomerListUploadCreateRequest._

case class CustomerListUploadCreateRequest (
  operation: UserListOperationType,
/* Number of parts to upload the file in. */
  totalParts: Integer)

object CustomerListUploadCreateRequest {
  import DateTimeCodecs._

  implicit val CustomerListUploadCreateRequestCodecJson: CodecJson[CustomerListUploadCreateRequest] = CodecJson.derive[CustomerListUploadCreateRequest]
  implicit val CustomerListUploadCreateRequestDecoder: EntityDecoder[CustomerListUploadCreateRequest] = jsonOf[CustomerListUploadCreateRequest]
  implicit val CustomerListUploadCreateRequestEncoder: EntityEncoder[CustomerListUploadCreateRequest] = jsonEncoderOf[CustomerListUploadCreateRequest]
}
