package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param label Policy label for an additional policy link.
 * @param link Policy link for an additional policy link.
 */
case class LeadFormCommonPolicyLinksInner(label: Option[String],
                link: Option[String]
                )

object LeadFormCommonPolicyLinksInner {
    /**
     * Creates the codec for converting LeadFormCommonPolicyLinksInner from and to JSON.
     */
    implicit val decoder: Decoder[LeadFormCommonPolicyLinksInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[LeadFormCommonPolicyLinksInner] = deriveEncoder
}
