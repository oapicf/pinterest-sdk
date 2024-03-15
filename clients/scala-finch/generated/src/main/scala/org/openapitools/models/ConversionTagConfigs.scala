package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * 
 * @param aemUnderscoreenabled Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
 * @param mdUnderscorefrequency Metadata ingestion frequency.
 * @param aemUnderscorefnlnUnderscoreenabled Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
 * @param aemUnderscorephUnderscoreenabled Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
 * @param aemUnderscoregeUnderscoreenabled Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
 * @param aemUnderscoredbUnderscoreenabled Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
 * @param aemUnderscorelocUnderscoreenabled Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
 */
case class ConversionTagConfigs(aemUnderscoreenabled: Option[Boolean],
                mdUnderscorefrequency: Option[BigDecimal],
                aemUnderscorefnlnUnderscoreenabled: Option[Boolean],
                aemUnderscorephUnderscoreenabled: Option[Boolean],
                aemUnderscoregeUnderscoreenabled: Option[Boolean],
                aemUnderscoredbUnderscoreenabled: Option[Boolean],
                aemUnderscorelocUnderscoreenabled: Option[Boolean]
                )

object ConversionTagConfigs {
    /**
     * Creates the codec for converting ConversionTagConfigs from and to JSON.
     */
    implicit val decoder: Decoder[ConversionTagConfigs] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionTagConfigs] = deriveEncoder
}
