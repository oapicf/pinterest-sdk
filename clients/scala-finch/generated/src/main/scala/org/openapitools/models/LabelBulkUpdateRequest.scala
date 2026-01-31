package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id Label ID.
 * @param status Set status to `ARCHIVED` to remove the label from the parent entity.
 * @param value </p><strong>Note:</strong> value field will be deprecated. Label name. 100-character limit.
 */
case class LabelBulkUpdateRequest(id: String,
                status: Option[String],
                value: Option[String]
                )

object LabelBulkUpdateRequest {
    /**
     * Creates the codec for converting LabelBulkUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[LabelBulkUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[LabelBulkUpdateRequest] = deriveEncoder
}
