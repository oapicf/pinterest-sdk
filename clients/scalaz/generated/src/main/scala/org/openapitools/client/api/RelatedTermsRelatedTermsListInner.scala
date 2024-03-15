package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RelatedTermsRelatedTermsListInner._

case class RelatedTermsRelatedTermsListInner (
  term: Option[String],
relatedTerms: Option[List[String]])

object RelatedTermsRelatedTermsListInner {
  import DateTimeCodecs._

  implicit val RelatedTermsRelatedTermsListInnerCodecJson: CodecJson[RelatedTermsRelatedTermsListInner] = CodecJson.derive[RelatedTermsRelatedTermsListInner]
  implicit val RelatedTermsRelatedTermsListInnerDecoder: EntityDecoder[RelatedTermsRelatedTermsListInner] = jsonOf[RelatedTermsRelatedTermsListInner]
  implicit val RelatedTermsRelatedTermsListInnerEncoder: EntityEncoder[RelatedTermsRelatedTermsListInner] = jsonEncoderOf[RelatedTermsRelatedTermsListInner]
}
