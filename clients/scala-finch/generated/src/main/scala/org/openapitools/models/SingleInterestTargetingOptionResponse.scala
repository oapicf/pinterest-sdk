package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param childUnderscoreinterests 
 * @param level 
 */
case class SingleInterestTargetingOptionResponse(id: Option[String],
                name: Option[String],
                childUnderscoreinterests: Option[Seq[String]],
                level: Option[Int]
                )

object SingleInterestTargetingOptionResponse {
    /**
     * Creates the codec for converting SingleInterestTargetingOptionResponse from and to JSON.
     */
    implicit val decoder: Decoder[SingleInterestTargetingOptionResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[SingleInterestTargetingOptionResponse] = deriveEncoder
}
