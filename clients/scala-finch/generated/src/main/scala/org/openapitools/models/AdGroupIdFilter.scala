package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param adUnderscoregroupUnderscoreids List of ad group ids
 */
case class AdGroupIdFilter(adUnderscoregroupUnderscoreids: Option[Seq[String]]
                )

object AdGroupIdFilter {
    /**
     * Creates the codec for converting AdGroupIdFilter from and to JSON.
     */
    implicit val decoder: Decoder[AdGroupIdFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdGroupIdFilter] = deriveEncoder
}
