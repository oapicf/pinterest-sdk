package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType

/**
 * User selection of conversion health criteria for a single feature
 * @param conversionType Status for conversion types
 * @param criteria Status for criteria
 * @param ingestionSource Status for ingestion sources
 * @param status Overall status for this selection item
 */
case class ConversionHealthSelectionItem(conversionType: Option[Object],
                criteria: Option[Object],
                ingestionSource: Option[Object],
                status: AnyType
                )

object ConversionHealthSelectionItem {
    /**
     * Creates the codec for converting ConversionHealthSelectionItem from and to JSON.
     */
    implicit val decoder: Decoder[ConversionHealthSelectionItem] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionHealthSelectionItem] = deriveEncoder
}
