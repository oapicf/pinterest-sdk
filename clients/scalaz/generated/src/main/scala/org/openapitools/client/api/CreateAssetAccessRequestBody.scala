package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateAssetAccessRequestBody._

case class CreateAssetAccessRequestBody (
  assetRequests: List[CreateAssetAccessRequestBodyAssetRequestsInner])

object CreateAssetAccessRequestBody {
  import DateTimeCodecs._

  implicit val CreateAssetAccessRequestBodyCodecJson: CodecJson[CreateAssetAccessRequestBody] = CodecJson.derive[CreateAssetAccessRequestBody]
  implicit val CreateAssetAccessRequestBodyDecoder: EntityDecoder[CreateAssetAccessRequestBody] = jsonOf[CreateAssetAccessRequestBody]
  implicit val CreateAssetAccessRequestBodyEncoder: EntityEncoder[CreateAssetAccessRequestBody] = jsonEncoderOf[CreateAssetAccessRequestBody]
}
