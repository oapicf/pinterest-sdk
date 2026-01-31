package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LabelStatus
import org.openapitools.models.LabelType

/**
 * 
 * @param id Label ID.
 * @param labelUnderscoretype 
 * @param parentUnderscoreid Label parent entity ID.
 * @param parentUnderscoretype Label parent entity type.
 * @param status 
 * @param value Label name.
 */
case class Label(id: Option[String],
                labelUnderscoretype: Option[LabelType],
                parentUnderscoreid: Option[String],
                parentUnderscoretype: Option[String],
                status: Option[LabelStatus],
                value: Option[String]
                )

object Label {
    /**
     * Creates the codec for converting Label from and to JSON.
     */
    implicit val decoder: Decoder[Label] = deriveDecoder
    implicit val encoder: ObjectEncoder[Label] = deriveEncoder
}
