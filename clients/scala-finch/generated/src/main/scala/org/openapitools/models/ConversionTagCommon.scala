package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.ConversionTagConfigs
import org.openapitools.models.EnhancedMatchStatusType

/**
 * 
 * @param codeUnderscoresnippet Tag code snippet.
 * @param configs 
 * @param enhancedUnderscorematchUnderscorestatus The enhanced match status of the tag
 * @param id Tag ID.
 * @param lastUnderscorefiredUnderscoretimeUnderscorems Time for the last event fired.
 * @param name Conversion tag name.
 * @param version Version number.
 */
case class ConversionTagCommon(codeUnderscoresnippet: Option[String],
                configs: Option[ConversionTagConfigs],
                enhancedUnderscorematchUnderscorestatus: Option[EnhancedMatchStatusType],
                id: Option[String],
                lastUnderscorefiredUnderscoretimeUnderscorems: Option[BigDecimal],
                name: String,
                version: Option[String]
                )

object ConversionTagCommon {
    /**
     * Creates the codec for converting ConversionTagCommon from and to JSON.
     */
    implicit val decoder: Decoder[ConversionTagCommon] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionTagCommon] = deriveEncoder
}
