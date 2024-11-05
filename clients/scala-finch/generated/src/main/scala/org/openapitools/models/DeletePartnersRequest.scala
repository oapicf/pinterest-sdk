package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param partnerUnderscoreids 
 * @param partnerUnderscoretype 
 */
case class DeletePartnersRequest(partnerUnderscoreids: Seq[String],
                partnerUnderscoretype: Option[String]
                )

object DeletePartnersRequest {
    /**
     * Creates the codec for converting DeletePartnersRequest from and to JSON.
     */
    implicit val decoder: Decoder[DeletePartnersRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeletePartnersRequest] = deriveEncoder
}
