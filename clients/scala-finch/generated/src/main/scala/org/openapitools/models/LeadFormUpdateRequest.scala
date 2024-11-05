package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LeadFormCommonPolicyLinksInner
import org.openapitools.models.LeadFormQuestion
import org.openapitools.models.LeadFormStatus
import scala.collection.immutable.Seq

/**
 * 
 * @param name Internal name of the lead form.
 * @param privacyUnderscorepolicyUnderscorelink A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
 * @param hasUnderscoreacceptedUnderscoreterms Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO
 * @param completionUnderscoremessage A message for people who complete the form to let them know what happens next.
 * @param status 
 * @param disclosureUnderscorelanguage Additional disclosure language to be included in the lead form.
 * @param questions List of questions to be displayed on the lead form.
 * @param policyUnderscorelinks List of additional policy links to be displayed on the lead form.
 * @param id The ID of this lead form to be updated
 */
case class LeadFormUpdateRequest(name: Option[String],
                privacyUnderscorepolicyUnderscorelink: Option[String],
                hasUnderscoreacceptedUnderscoreterms: Option[Boolean],
                completionUnderscoremessage: Option[String],
                status: Option[LeadFormStatus],
                disclosureUnderscorelanguage: Option[String],
                questions: Option[Seq[LeadFormQuestion]],
                policyUnderscorelinks: Option[Seq[LeadFormCommonPolicyLinksInner]],
                id: String
                )

object LeadFormUpdateRequest {
    /**
     * Creates the codec for converting LeadFormUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[LeadFormUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[LeadFormUpdateRequest] = deriveEncoder
}
