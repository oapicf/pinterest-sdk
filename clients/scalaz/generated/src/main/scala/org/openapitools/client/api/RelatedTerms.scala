package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RelatedTerms._

case class RelatedTerms (
  /* First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\" */
  id: Option[String],
/* Total number of related terms returned */
  relatedTermCount: Option[Integer],
/* The id of the advertiser. */
  relatedTermsList: Option[List[RelatedTermsRelatedTermsListInner]])

object RelatedTerms {
  import DateTimeCodecs._

  implicit val RelatedTermsCodecJson: CodecJson[RelatedTerms] = CodecJson.derive[RelatedTerms]
  implicit val RelatedTermsDecoder: EntityDecoder[RelatedTerms] = jsonOf[RelatedTerms]
  implicit val RelatedTermsEncoder: EntityEncoder[RelatedTerms] = jsonEncoderOf[RelatedTerms]
}
