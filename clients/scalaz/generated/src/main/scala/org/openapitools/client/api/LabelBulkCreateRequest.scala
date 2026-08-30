package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LabelBulkCreateRequest._

case class LabelBulkCreateRequest (
  /* Labels that you are applying to the campaign. */
  labels: List[LabelCreateItem],
/* Unique identifier of the asset you are labelling. Currently, you can only label campaigns. */
  parentId: String)

object LabelBulkCreateRequest {
  import DateTimeCodecs._

  implicit val LabelBulkCreateRequestCodecJson: CodecJson[LabelBulkCreateRequest] = CodecJson.derive[LabelBulkCreateRequest]
  implicit val LabelBulkCreateRequestDecoder: EntityDecoder[LabelBulkCreateRequest] = jsonOf[LabelBulkCreateRequest]
  implicit val LabelBulkCreateRequestEncoder: EntityEncoder[LabelBulkCreateRequest] = jsonEncoderOf[LabelBulkCreateRequest]
}
