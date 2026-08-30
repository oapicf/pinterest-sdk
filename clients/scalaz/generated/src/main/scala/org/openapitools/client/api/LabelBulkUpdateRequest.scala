package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LabelBulkUpdateRequest._

case class LabelBulkUpdateRequest (
  /* Label ID. */
  id: String,
/* Unique identifier of the asset you are labelling. Currently, you can only label campaigns. */
  parentId: String,
status: LabelStatusBulkUpdate)

object LabelBulkUpdateRequest {
  import DateTimeCodecs._

  implicit val LabelBulkUpdateRequestCodecJson: CodecJson[LabelBulkUpdateRequest] = CodecJson.derive[LabelBulkUpdateRequest]
  implicit val LabelBulkUpdateRequestDecoder: EntityDecoder[LabelBulkUpdateRequest] = jsonOf[LabelBulkUpdateRequest]
  implicit val LabelBulkUpdateRequestEncoder: EntityEncoder[LabelBulkUpdateRequest] = jsonEncoderOf[LabelBulkUpdateRequest]
}
