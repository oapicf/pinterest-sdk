package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param childUnderscoreinterests 
 * @param id 
 * @param level 
 * @param name 
 */
case class SingleInterestTargetingOptionResponse(childUnderscoreinterests: Option[Seq[String]],
                id: Option[String],
                level: Option[Int],
                name: Option[String]
                )

object SingleInterestTargetingOptionResponse {
    /**
     * Creates the codec for converting SingleInterestTargetingOptionResponse from and to JSON.
     */
    implicit val decoder: Decoder[SingleInterestTargetingOptionResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[SingleInterestTargetingOptionResponse] = deriveEncoder
}
