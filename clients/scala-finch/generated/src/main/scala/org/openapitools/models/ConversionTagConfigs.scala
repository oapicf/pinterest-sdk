package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import scala.collection.immutable.Seq

/**
 * 
 * @param aemUnderscoredbUnderscoreenabled Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @param aemUnderscoreenabled Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @param aemUnderscoreexternalUnderscoreidUnderscoreenabled Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @param aemUnderscorefnlnUnderscoreenabled Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @param aemUnderscoregeUnderscoreenabled Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @param aemUnderscorelocUnderscoreenabled Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @param aemUnderscorephUnderscoreenabled Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @param mdUnderscorefrequency Metadata ingestion frequency.
 * @param noUnderscorecodeUnderscorecapiUnderscoredomains List of advertiser subdomains configured for NoCodeCAPI calls.
 */
case class ConversionTagConfigs(aemUnderscoredbUnderscoreenabled: Option[Boolean],
                aemUnderscoreenabled: Option[Boolean],
                aemUnderscoreexternalUnderscoreidUnderscoreenabled: Option[Boolean],
                aemUnderscorefnlnUnderscoreenabled: Option[Boolean],
                aemUnderscoregeUnderscoreenabled: Option[Boolean],
                aemUnderscorelocUnderscoreenabled: Option[Boolean],
                aemUnderscorephUnderscoreenabled: Option[Boolean],
                mdUnderscorefrequency: Option[BigDecimal],
                noUnderscorecodeUnderscorecapiUnderscoredomains: Option[Seq[String]]
                )

object ConversionTagConfigs {
    /**
     * Creates the codec for converting ConversionTagConfigs from and to JSON.
     */
    implicit val decoder: Decoder[ConversionTagConfigs] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionTagConfigs] = deriveEncoder
}
