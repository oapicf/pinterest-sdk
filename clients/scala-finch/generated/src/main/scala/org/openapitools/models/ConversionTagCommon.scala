package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.ConversionTagConfigs
import org.openapitools.models.EnhancedMatchStatusType
import org.openapitools.models.EntityStatus

/**
 * 
 * @param adUnderscoreaccountUnderscoreid Ad account ID.
 * @param codeUnderscoresnippet Tag code snippet.
 * @param enhancedUnderscorematchUnderscorestatus 
 * @param id Tag ID.
 * @param lastUnderscorefiredUnderscoretimeUnderscorems Time for the last event fired.
 * @param name Conversion tag name.
 * @param status 
 * @param version Version number.
 * @param configs 
 */
case class ConversionTagCommon(adUnderscoreaccountUnderscoreid: Option[String],
                codeUnderscoresnippet: Option[String],
                enhancedUnderscorematchUnderscorestatus: Option[EnhancedMatchStatusType],
                id: Option[String],
                lastUnderscorefiredUnderscoretimeUnderscorems: Option[BigDecimal],
                name: Option[String],
                status: Option[EntityStatus],
                version: Option[String],
                configs: Option[ConversionTagConfigs]
                )

object ConversionTagCommon {
    /**
     * Creates the codec for converting ConversionTagCommon from and to JSON.
     */
    implicit val decoder: Decoder[ConversionTagCommon] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionTagCommon] = deriveEncoder
}
