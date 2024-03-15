package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param canonicalUnderscoreurl 
 * @param id 
 * @param key 
 * @param name 
 */
case class Interest(canonicalUnderscoreurl: Option[String],
                id: Option[String],
                key: Option[String],
                name: Option[String]
                )

object Interest {
    /**
     * Creates the codec for converting Interest from and to JSON.
     */
    implicit val decoder: Decoder[Interest] = deriveDecoder
    implicit val encoder: ObjectEncoder[Interest] = deriveEncoder
}
