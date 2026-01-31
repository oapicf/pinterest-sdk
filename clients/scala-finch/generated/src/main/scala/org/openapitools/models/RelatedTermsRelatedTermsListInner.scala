package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param relatedUnderscoreterms 
 * @param term 
 */
case class RelatedTermsRelatedTermsListInner(relatedUnderscoreterms: Option[Seq[String]],
                term: Option[String]
                )

object RelatedTermsRelatedTermsListInner {
    /**
     * Creates the codec for converting RelatedTermsRelatedTermsListInner from and to JSON.
     */
    implicit val decoder: Decoder[RelatedTermsRelatedTermsListInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[RelatedTermsRelatedTermsListInner] = deriveEncoder
}
