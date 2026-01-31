package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.QualityComponentDetails

/**
 * Set of quality components, with each component containing a event coverage and details.
 * @param advertiserUnderscoreexternalUnderscoreid 
 * @param clickUnderscoreidUnderscoreepik 
 * @param externalUnderscoreeventUnderscoreid Dedup components.
 * @param hashedUnderscoreemail User matching identifiers.
 * @param hashedUnderscoremaid 
 * @param ipUnderscoreaddress 
 * @param orderUnderscoreid 
 * @param orderUnderscorevalue 
 * @param productUnderscoreid Product/event metadata.
 * @param sourceUnderscoreurl 
 * @param userUnderscoreagent 
 */
case class QualityComponents(advertiserUnderscoreexternalUnderscoreid: Option[Map[String, QualityComponentDetails]],
                clickUnderscoreidUnderscoreepik: Option[Map[String, QualityComponentDetails]],
                externalUnderscoreeventUnderscoreid: Option[Map[String, QualityComponentDetails]],
                hashedUnderscoreemail: Option[Map[String, QualityComponentDetails]],
                hashedUnderscoremaid: Option[Map[String, QualityComponentDetails]],
                ipUnderscoreaddress: Option[Map[String, QualityComponentDetails]],
                orderUnderscoreid: Option[Map[String, QualityComponentDetails]],
                orderUnderscorevalue: Option[Map[String, QualityComponentDetails]],
                productUnderscoreid: Option[Map[String, QualityComponentDetails]],
                sourceUnderscoreurl: Option[Map[String, QualityComponentDetails]],
                userUnderscoreagent: Option[Map[String, QualityComponentDetails]]
                )

object QualityComponents {
    /**
     * Creates the codec for converting QualityComponents from and to JSON.
     */
    implicit val decoder: Decoder[QualityComponents] = deriveDecoder
    implicit val encoder: ObjectEncoder[QualityComponents] = deriveEncoder
}
