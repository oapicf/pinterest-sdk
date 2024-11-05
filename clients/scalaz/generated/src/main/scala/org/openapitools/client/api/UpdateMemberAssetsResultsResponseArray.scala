package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateMemberAssetsResultsResponseArray._

case class UpdateMemberAssetsResultsResponseArray (
  /* List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned. */
  items: Option[List[UpdateMemberAssetsResultsResponseArrayItemsInner]])

object UpdateMemberAssetsResultsResponseArray {
  import DateTimeCodecs._

  implicit val UpdateMemberAssetsResultsResponseArrayCodecJson: CodecJson[UpdateMemberAssetsResultsResponseArray] = CodecJson.derive[UpdateMemberAssetsResultsResponseArray]
  implicit val UpdateMemberAssetsResultsResponseArrayDecoder: EntityDecoder[UpdateMemberAssetsResultsResponseArray] = jsonOf[UpdateMemberAssetsResultsResponseArray]
  implicit val UpdateMemberAssetsResultsResponseArrayEncoder: EntityEncoder[UpdateMemberAssetsResultsResponseArray] = jsonEncoderOf[UpdateMemberAssetsResultsResponseArray]
}
