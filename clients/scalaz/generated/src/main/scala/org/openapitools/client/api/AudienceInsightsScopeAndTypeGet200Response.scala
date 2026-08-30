package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceInsightsScopeAndTypeGet200Response._

case class AudienceInsightsScopeAndTypeGet200Response (
  items: List[AudienceDefinition])

object AudienceInsightsScopeAndTypeGet200Response {
  import DateTimeCodecs._

  implicit val AudienceInsightsScopeAndTypeGet200ResponseCodecJson: CodecJson[AudienceInsightsScopeAndTypeGet200Response] = CodecJson.derive[AudienceInsightsScopeAndTypeGet200Response]
  implicit val AudienceInsightsScopeAndTypeGet200ResponseDecoder: EntityDecoder[AudienceInsightsScopeAndTypeGet200Response] = jsonOf[AudienceInsightsScopeAndTypeGet200Response]
  implicit val AudienceInsightsScopeAndTypeGet200ResponseEncoder: EntityEncoder[AudienceInsightsScopeAndTypeGet200Response] = jsonEncoderOf[AudienceInsightsScopeAndTypeGet200Response]
}
