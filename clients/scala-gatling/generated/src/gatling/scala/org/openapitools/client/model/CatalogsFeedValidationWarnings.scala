
package org.openapitools.client.model


case class CatalogsFeedValidationWarnings (
    _titleLengthTooLong: Option[Integer],
    _descriptionLengthTooLong: Option[Integer],
    _genderInvalid: Option[Integer],
    _ageGroupInvalid: Option[Integer],
    _sizeTypeInvalid: Option[Integer],
    _linkFormatWarning: Option[Integer],
    _duplicateProducts: Option[Integer],
    _duplicateLinks: Option[Integer],
    _salesPriceInvalid: Option[Integer],
    _productCategoryDepthWarning: Option[Integer],
    _adwordsSameAsLink: Option[Integer],
    _duplicateHeaders: Option[Integer],
    _fetchSameSignature: Option[Integer],
    _adwordsFormatWarning: Option[Integer],
    _additionalImageLinkWarning: Option[Integer],
    _imageLinkWarning: Option[Integer],
    _shippingInvalid: Option[Integer],
    _taxInvalid: Option[Integer],
    _shippingWeightInvalid: Option[Integer],
    _expirationDateInvalid: Option[Integer],
    _availabilityDateInvalid: Option[Integer],
    _saleDateInvalid: Option[Integer],
    _weightUnitInvalid: Option[Integer],
    _isBundleInvalid: Option[Integer],
    _updatedTimeInvalid: Option[Integer],
    _customLabelLengthTooLong: Option[Integer],
    _productTypeLengthTooLong: Option[Integer],
    _tooManyAdditionalImageLinks: Option[Integer],
    _multipackInvalid: Option[Integer],
    _indexedProductCountLargeDelta: Option[Integer],
    _itemAdditionalImageDownloadFailure: Option[Integer],
    _optionalProductCategoryMissing: Option[Integer],
    _optionalProductCategoryInvalid: Option[Integer],
    _optionalConditionMissing: Option[Integer],
    _optionalConditionInvalid: Option[Integer],
    _iosDeepLinkInvalid: Option[Integer],
    _androidDeepLinkInvalid: Option[Integer],
    _availabilityNormalized: Option[Integer],
    _conditionNormalized: Option[Integer],
    _genderNormalized: Option[Integer],
    _sizeTypeNormalized: Option[Integer],
    _ageGroupNormalized: Option[Integer],
    _utmSourceAutoCorrected: Option[Integer],
    _countryDoesNotMapToCurrency: Option[Integer],
    _minAdPriceInvalid: Option[Integer]
)
object CatalogsFeedValidationWarnings {
    def toStringBody(var_titleLengthTooLong: Object, var_descriptionLengthTooLong: Object, var_genderInvalid: Object, var_ageGroupInvalid: Object, var_sizeTypeInvalid: Object, var_linkFormatWarning: Object, var_duplicateProducts: Object, var_duplicateLinks: Object, var_salesPriceInvalid: Object, var_productCategoryDepthWarning: Object, var_adwordsSameAsLink: Object, var_duplicateHeaders: Object, var_fetchSameSignature: Object, var_adwordsFormatWarning: Object, var_additionalImageLinkWarning: Object, var_imageLinkWarning: Object, var_shippingInvalid: Object, var_taxInvalid: Object, var_shippingWeightInvalid: Object, var_expirationDateInvalid: Object, var_availabilityDateInvalid: Object, var_saleDateInvalid: Object, var_weightUnitInvalid: Object, var_isBundleInvalid: Object, var_updatedTimeInvalid: Object, var_customLabelLengthTooLong: Object, var_productTypeLengthTooLong: Object, var_tooManyAdditionalImageLinks: Object, var_multipackInvalid: Object, var_indexedProductCountLargeDelta: Object, var_itemAdditionalImageDownloadFailure: Object, var_optionalProductCategoryMissing: Object, var_optionalProductCategoryInvalid: Object, var_optionalConditionMissing: Object, var_optionalConditionInvalid: Object, var_iosDeepLinkInvalid: Object, var_androidDeepLinkInvalid: Object, var_availabilityNormalized: Object, var_conditionNormalized: Object, var_genderNormalized: Object, var_sizeTypeNormalized: Object, var_ageGroupNormalized: Object, var_utmSourceAutoCorrected: Object, var_countryDoesNotMapToCurrency: Object, var_minAdPriceInvalid: Object) =
        s"""
        | {
        | "titleLengthTooLong":$var_titleLengthTooLong,"descriptionLengthTooLong":$var_descriptionLengthTooLong,"genderInvalid":$var_genderInvalid,"ageGroupInvalid":$var_ageGroupInvalid,"sizeTypeInvalid":$var_sizeTypeInvalid,"linkFormatWarning":$var_linkFormatWarning,"duplicateProducts":$var_duplicateProducts,"duplicateLinks":$var_duplicateLinks,"salesPriceInvalid":$var_salesPriceInvalid,"productCategoryDepthWarning":$var_productCategoryDepthWarning,"adwordsSameAsLink":$var_adwordsSameAsLink,"duplicateHeaders":$var_duplicateHeaders,"fetchSameSignature":$var_fetchSameSignature,"adwordsFormatWarning":$var_adwordsFormatWarning,"additionalImageLinkWarning":$var_additionalImageLinkWarning,"imageLinkWarning":$var_imageLinkWarning,"shippingInvalid":$var_shippingInvalid,"taxInvalid":$var_taxInvalid,"shippingWeightInvalid":$var_shippingWeightInvalid,"expirationDateInvalid":$var_expirationDateInvalid,"availabilityDateInvalid":$var_availabilityDateInvalid,"saleDateInvalid":$var_saleDateInvalid,"weightUnitInvalid":$var_weightUnitInvalid,"isBundleInvalid":$var_isBundleInvalid,"updatedTimeInvalid":$var_updatedTimeInvalid,"customLabelLengthTooLong":$var_customLabelLengthTooLong,"productTypeLengthTooLong":$var_productTypeLengthTooLong,"tooManyAdditionalImageLinks":$var_tooManyAdditionalImageLinks,"multipackInvalid":$var_multipackInvalid,"indexedProductCountLargeDelta":$var_indexedProductCountLargeDelta,"itemAdditionalImageDownloadFailure":$var_itemAdditionalImageDownloadFailure,"optionalProductCategoryMissing":$var_optionalProductCategoryMissing,"optionalProductCategoryInvalid":$var_optionalProductCategoryInvalid,"optionalConditionMissing":$var_optionalConditionMissing,"optionalConditionInvalid":$var_optionalConditionInvalid,"iosDeepLinkInvalid":$var_iosDeepLinkInvalid,"androidDeepLinkInvalid":$var_androidDeepLinkInvalid,"availabilityNormalized":$var_availabilityNormalized,"conditionNormalized":$var_conditionNormalized,"genderNormalized":$var_genderNormalized,"sizeTypeNormalized":$var_sizeTypeNormalized,"ageGroupNormalized":$var_ageGroupNormalized,"utmSourceAutoCorrected":$var_utmSourceAutoCorrected,"countryDoesNotMapToCurrency":$var_countryDoesNotMapToCurrency,"minAdPriceInvalid":$var_minAdPriceInvalid
        | }
        """.stripMargin
}
