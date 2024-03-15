package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param term 
 * @param relatedUnderscoreterms 
 */
case class RelatedTermsRelatedTermsListInner(term: Option[String],
                relatedUnderscoreterms: Option[Seq[String]]
                )

object RelatedTermsRelatedTermsListInner {
    /**
     * Creates the codec for converting RelatedTermsRelatedTermsListInner from and to JSON.
     */
    implicit val decoder: Decoder[RelatedTermsRelatedTermsListInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[RelatedTermsRelatedTermsListInner] = deriveEncoder
}
