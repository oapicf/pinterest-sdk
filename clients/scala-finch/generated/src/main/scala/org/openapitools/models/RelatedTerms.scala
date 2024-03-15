package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RelatedTermsRelatedTermsListInner
import scala.collection.immutable.Seq

/**
 * 
 * @param id First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"
 * @param relatedUnderscoretermUnderscorecount Total number of related terms returned
 * @param relatedUnderscoretermsUnderscorelist The id of the advertiser.
 */
case class RelatedTerms(id: Option[String],
                relatedUnderscoretermUnderscorecount: Option[Int],
                relatedUnderscoretermsUnderscorelist: Option[Seq[RelatedTermsRelatedTermsListInner]]
                )

object RelatedTerms {
    /**
     * Creates the codec for converting RelatedTerms from and to JSON.
     */
    implicit val decoder: Decoder[RelatedTerms] = deriveDecoder
    implicit val encoder: ObjectEncoder[RelatedTerms] = deriveEncoder
}
