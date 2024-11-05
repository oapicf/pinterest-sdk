package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateMemberAssetsResultsResponseArrayItemsInner._

case class UpdateMemberAssetsResultsResponseArrayItemsInner (
  response: Option[UsersForIndividualAssetResponse])

object UpdateMemberAssetsResultsResponseArrayItemsInner {
  import DateTimeCodecs._

  implicit val UpdateMemberAssetsResultsResponseArrayItemsInnerCodecJson: CodecJson[UpdateMemberAssetsResultsResponseArrayItemsInner] = CodecJson.derive[UpdateMemberAssetsResultsResponseArrayItemsInner]
  implicit val UpdateMemberAssetsResultsResponseArrayItemsInnerDecoder: EntityDecoder[UpdateMemberAssetsResultsResponseArrayItemsInner] = jsonOf[UpdateMemberAssetsResultsResponseArrayItemsInner]
  implicit val UpdateMemberAssetsResultsResponseArrayItemsInnerEncoder: EntityEncoder[UpdateMemberAssetsResultsResponseArrayItemsInner] = jsonEncoderOf[UpdateMemberAssetsResultsResponseArrayItemsInner]
}
