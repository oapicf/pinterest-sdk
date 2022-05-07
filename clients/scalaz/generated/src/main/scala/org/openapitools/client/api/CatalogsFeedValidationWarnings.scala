package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsFeedValidationWarnings._

case class CatalogsFeedValidationWarnings (
  titleLengthTooLong: Option[Integer],
descriptionLengthTooLong: Option[Integer],
genderInvalid: Option[Integer],
ageGroupInvalid: Option[Integer],
sizeTypeInvalid: Option[Integer],
linkFormatWarning: Option[Integer],
duplicateProducts: Option[Integer],
duplicateLinks: Option[Integer],
salesPriceInvalid: Option[Integer],
productCategoryDepthWarning: Option[Integer],
adwordsSameAsLink: Option[Integer],
duplicateHeaders: Option[Integer],
fetchSameSignature: Option[Integer],
adwordsFormatWarning: Option[Integer],
additionalImageLinkWarning: Option[Integer],
imageLinkWarning: Option[Integer],
shippingInvalid: Option[Integer],
taxInvalid: Option[Integer],
shippingWeightInvalid: Option[Integer],
expirationDateInvalid: Option[Integer],
availabilityDateInvalid: Option[Integer],
saleDateInvalid: Option[Integer],
weightUnitInvalid: Option[Integer],
isBundleInvalid: Option[Integer],
updatedTimeInvalid: Option[Integer],
customLabelLengthTooLong: Option[Integer],
productTypeLengthTooLong: Option[Integer],
tooManyAdditionalImageLinks: Option[Integer],
multipackInvalid: Option[Integer],
indexedProductCountLargeDelta: Option[Integer],
itemAdditionalImageDownloadFailure: Option[Integer],
optionalProductCategoryMissing: Option[Integer],
optionalProductCategoryInvalid: Option[Integer],
optionalConditionMissing: Option[Integer],
optionalConditionInvalid: Option[Integer],
iosDeepLinkInvalid: Option[Integer],
androidDeepLinkInvalid: Option[Integer],
availabilityNormalized: Option[Integer],
conditionNormalized: Option[Integer],
genderNormalized: Option[Integer],
sizeTypeNormalized: Option[Integer],
ageGroupNormalized: Option[Integer],
utmSourceAutoCorrected: Option[Integer],
countryDoesNotMapToCurrency: Option[Integer],
minAdPriceInvalid: Option[Integer])

object CatalogsFeedValidationWarnings {
  import DateTimeCodecs._

  implicit val CatalogsFeedValidationWarningsCodecJson: CodecJson[CatalogsFeedValidationWarnings] = CodecJson.derive[CatalogsFeedValidationWarnings]
  implicit val CatalogsFeedValidationWarningsDecoder: EntityDecoder[CatalogsFeedValidationWarnings] = jsonOf[CatalogsFeedValidationWarnings]
  implicit val CatalogsFeedValidationWarningsEncoder: EntityEncoder[CatalogsFeedValidationWarnings] = jsonEncoderOf[CatalogsFeedValidationWarnings]
}
