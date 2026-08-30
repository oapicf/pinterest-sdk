package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RelatedTermsRelatedTermsListItems._

case class RelatedTermsRelatedTermsListItems (
  relatedTerms: Option[List[String]],
term: Option[String])

object RelatedTermsRelatedTermsListItems {
  import DateTimeCodecs._

  implicit val RelatedTermsRelatedTermsListItemsCodecJson: CodecJson[RelatedTermsRelatedTermsListItems] = CodecJson.derive[RelatedTermsRelatedTermsListItems]
  implicit val RelatedTermsRelatedTermsListItemsDecoder: EntityDecoder[RelatedTermsRelatedTermsListItems] = jsonOf[RelatedTermsRelatedTermsListItems]
  implicit val RelatedTermsRelatedTermsListItemsEncoder: EntityEncoder[RelatedTermsRelatedTermsListItems] = jsonEncoderOf[RelatedTermsRelatedTermsListItems]
}
