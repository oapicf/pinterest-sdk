package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsFeedValidationErrors._

case class CatalogsFeedValidationErrors (
  fetchError: Option[Integer],
fetchInactiveFeedError: Option[Integer],
encodingError: Option[Integer],
delimiterError: Option[Integer],
requiredColumnsMissing: Option[Integer],
imageLinkInvalid: Option[Integer],
itemidMissing: Option[Integer],
titleMissing: Option[Integer],
descriptionMissing: Option[Integer],
productCategoryInvalid: Option[Integer],
productLinkMissing: Option[Integer],
imageLinkMissing: Option[Integer],
availabilityInvalid: Option[Integer],
productPriceInvalid: Option[Integer],
linkFormatInvalid: Option[Integer],
parseLineError: Option[Integer],
adwordsFormatInvalid: Option[Integer],
productCategoryMissing: Option[Integer],
internalServiceError: Option[Integer],
noVerifiedDomain: Option[Integer],
adultInvalid: Option[Integer],
invalidDomain: Option[Integer],
feedLengthTooLong: Option[Integer],
linkLengthTooLong: Option[Integer],
malformedXml: Option[Integer],
redirectInvalid: Option[Integer],
priceMissing: Option[Integer],
feedTooSmall: Option[Integer],
conditionInvalid: Option[Integer],
shopifyNoProducts: Option[Integer],
maxItemsPerItemGroupExceeded: Option[Integer],
itemMainImageDownloadFailure: Option[Integer],
pinjoinContentUnsafe: Option[Integer],
blocklistedImageSignature: Option[Integer])

object CatalogsFeedValidationErrors {
  import DateTimeCodecs._

  implicit val CatalogsFeedValidationErrorsCodecJson: CodecJson[CatalogsFeedValidationErrors] = CodecJson.derive[CatalogsFeedValidationErrors]
  implicit val CatalogsFeedValidationErrorsDecoder: EntityDecoder[CatalogsFeedValidationErrors] = jsonOf[CatalogsFeedValidationErrors]
  implicit val CatalogsFeedValidationErrorsEncoder: EntityEncoder[CatalogsFeedValidationErrors] = jsonEncoderOf[CatalogsFeedValidationErrors]
}
