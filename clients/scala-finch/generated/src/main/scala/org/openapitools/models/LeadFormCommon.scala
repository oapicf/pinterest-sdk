package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LeadFormQuestion
import org.openapitools.models.LeadFormStatus
import scala.collection.immutable.Seq

/**
 * Creation fields
 * @param name Internal name of the lead form.
 * @param privacyUnderscorepolicyUnderscorelink A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
 * @param hasUnderscoreacceptedUnderscoreterms Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.
 * @param completionUnderscoremessage A message for people who complete the form to let them know what happens next.
 * @param status 
 * @param disclosureUnderscorelanguage Additional disclosure language to be included in the lead form.
 * @param questions List of questions to be displayed on the lead form.
 */
case class LeadFormCommon(name: Option[String],
                privacyUnderscorepolicyUnderscorelink: Option[String],
                hasUnderscoreacceptedUnderscoreterms: Option[Boolean],
                completionUnderscoremessage: Option[String],
                status: Option[LeadFormStatus],
                disclosureUnderscorelanguage: Option[String],
                questions: Option[Seq[LeadFormQuestion]]
                )

object LeadFormCommon {
    /**
     * Creates the codec for converting LeadFormCommon from and to JSON.
     */
    implicit val decoder: Decoder[LeadFormCommon] = deriveDecoder
    implicit val encoder: ObjectEncoder[LeadFormCommon] = deriveEncoder
}
