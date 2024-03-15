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
 * 
 * @param name Internal name of the lead form.
 * @param privacyUnderscorepolicyUnderscorelink A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
 * @param hasUnderscoreacceptedUnderscoreterms Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.
 * @param completionUnderscoremessage A message for people who complete the form to let them know what happens next.
 * @param status 
 * @param disclosureUnderscorelanguage Additional disclosure language to be included in the lead form.
 * @param questions List of questions to be displayed on the lead form.
 * @param id The ID of this lead form
 * @param adUnderscoreaccountUnderscoreid The Ad Account ID that this lead form belongs to.
 * @param createdUnderscoretime Lead form creation time. Unix timestamp in seconds.
 * @param updatedUnderscoretime Last update time. Unix timestamp in seconds.
 */
case class LeadFormResponse(name: Option[String],
                privacyUnderscorepolicyUnderscorelink: Option[String],
                hasUnderscoreacceptedUnderscoreterms: Option[Boolean],
                completionUnderscoremessage: Option[String],
                status: Option[LeadFormStatus],
                disclosureUnderscorelanguage: Option[String],
                questions: Option[Seq[LeadFormQuestion]],
                id: Option[String],
                adUnderscoreaccountUnderscoreid: Option[String],
                createdUnderscoretime: Option[Int],
                updatedUnderscoretime: Option[Int]
                )

object LeadFormResponse {
    /**
     * Creates the codec for converting LeadFormResponse from and to JSON.
     */
    implicit val decoder: Decoder[LeadFormResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[LeadFormResponse] = deriveEncoder
}
