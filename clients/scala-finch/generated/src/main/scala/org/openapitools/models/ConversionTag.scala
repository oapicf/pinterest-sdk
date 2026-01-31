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
 * @param codeUnderscoresnippet Tag code snippet.
 * @param configs 
 * @param enhancedUnderscorematchUnderscorestatus The enhanced match status of the tag
 * @param id Tag ID.
 * @param lastUnderscorefiredUnderscoretimeUnderscorems Time for the last event fired.
 * @param name Conversion tag name.
 * @param version Version number.
 * @param adUnderscoreaccountUnderscoreid Ad account ID.
 * @param status 
 */
case class ConversionTag(codeUnderscoresnippet: Option[String],
                configs: Option[ConversionTagConfigs],
                enhancedUnderscorematchUnderscorestatus: Option[EnhancedMatchStatusType],
                id: Option[String],
                lastUnderscorefiredUnderscoretimeUnderscorems: Option[BigDecimal],
                name: String,
                version: Option[String],
                adUnderscoreaccountUnderscoreid: String,
                status: Option[EntityStatus]
                )

object ConversionTag {
    /**
     * Creates the codec for converting ConversionTag from and to JSON.
     */
    implicit val decoder: Decoder[ConversionTag] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionTag] = deriveEncoder
}
