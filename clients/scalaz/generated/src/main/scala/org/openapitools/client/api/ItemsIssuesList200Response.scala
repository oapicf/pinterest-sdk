package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemsIssuesList200Response._

case class ItemsIssuesList200Response (
  items: List[CatalogsItemValidationIssues],
bookmark: Option[String])

object ItemsIssuesList200Response {
  import DateTimeCodecs._

  implicit val ItemsIssuesList200ResponseCodecJson: CodecJson[ItemsIssuesList200Response] = CodecJson.derive[ItemsIssuesList200Response]
  implicit val ItemsIssuesList200ResponseDecoder: EntityDecoder[ItemsIssuesList200Response] = jsonOf[ItemsIssuesList200Response]
  implicit val ItemsIssuesList200ResponseEncoder: EntityEncoder[ItemsIssuesList200Response] = jsonEncoderOf[ItemsIssuesList200Response]
}
