
package org.openapitools.client.model


case class CatalogsFeedValidationErrors (
    _fetchError: Option[Integer],
    _fetchInactiveFeedError: Option[Integer],
    _encodingError: Option[Integer],
    _delimiterError: Option[Integer],
    _requiredColumnsMissing: Option[Integer],
    _imageLinkInvalid: Option[Integer],
    _itemidMissing: Option[Integer],
    _titleMissing: Option[Integer],
    _descriptionMissing: Option[Integer],
    _productCategoryInvalid: Option[Integer],
    _productLinkMissing: Option[Integer],
    _imageLinkMissing: Option[Integer],
    _availabilityInvalid: Option[Integer],
    _productPriceInvalid: Option[Integer],
    _linkFormatInvalid: Option[Integer],
    _parseLineError: Option[Integer],
    _adwordsFormatInvalid: Option[Integer],
    _productCategoryMissing: Option[Integer],
    _internalServiceError: Option[Integer],
    _noVerifiedDomain: Option[Integer],
    _adultInvalid: Option[Integer],
    _invalidDomain: Option[Integer],
    _feedLengthTooLong: Option[Integer],
    _linkLengthTooLong: Option[Integer],
    _malformedXml: Option[Integer],
    _redirectInvalid: Option[Integer],
    _priceMissing: Option[Integer],
    _feedTooSmall: Option[Integer],
    _conditionInvalid: Option[Integer],
    _shopifyNoProducts: Option[Integer],
    _maxItemsPerItemGroupExceeded: Option[Integer],
    _itemMainImageDownloadFailure: Option[Integer],
    _pinjoinContentUnsafe: Option[Integer],
    _blocklistedImageSignature: Option[Integer]
)
object CatalogsFeedValidationErrors {
    def toStringBody(var_fetchError: Object, var_fetchInactiveFeedError: Object, var_encodingError: Object, var_delimiterError: Object, var_requiredColumnsMissing: Object, var_imageLinkInvalid: Object, var_itemidMissing: Object, var_titleMissing: Object, var_descriptionMissing: Object, var_productCategoryInvalid: Object, var_productLinkMissing: Object, var_imageLinkMissing: Object, var_availabilityInvalid: Object, var_productPriceInvalid: Object, var_linkFormatInvalid: Object, var_parseLineError: Object, var_adwordsFormatInvalid: Object, var_productCategoryMissing: Object, var_internalServiceError: Object, var_noVerifiedDomain: Object, var_adultInvalid: Object, var_invalidDomain: Object, var_feedLengthTooLong: Object, var_linkLengthTooLong: Object, var_malformedXml: Object, var_redirectInvalid: Object, var_priceMissing: Object, var_feedTooSmall: Object, var_conditionInvalid: Object, var_shopifyNoProducts: Object, var_maxItemsPerItemGroupExceeded: Object, var_itemMainImageDownloadFailure: Object, var_pinjoinContentUnsafe: Object, var_blocklistedImageSignature: Object) =
        s"""
        | {
        | "fetchError":$var_fetchError,"fetchInactiveFeedError":$var_fetchInactiveFeedError,"encodingError":$var_encodingError,"delimiterError":$var_delimiterError,"requiredColumnsMissing":$var_requiredColumnsMissing,"imageLinkInvalid":$var_imageLinkInvalid,"itemidMissing":$var_itemidMissing,"titleMissing":$var_titleMissing,"descriptionMissing":$var_descriptionMissing,"productCategoryInvalid":$var_productCategoryInvalid,"productLinkMissing":$var_productLinkMissing,"imageLinkMissing":$var_imageLinkMissing,"availabilityInvalid":$var_availabilityInvalid,"productPriceInvalid":$var_productPriceInvalid,"linkFormatInvalid":$var_linkFormatInvalid,"parseLineError":$var_parseLineError,"adwordsFormatInvalid":$var_adwordsFormatInvalid,"productCategoryMissing":$var_productCategoryMissing,"internalServiceError":$var_internalServiceError,"noVerifiedDomain":$var_noVerifiedDomain,"adultInvalid":$var_adultInvalid,"invalidDomain":$var_invalidDomain,"feedLengthTooLong":$var_feedLengthTooLong,"linkLengthTooLong":$var_linkLengthTooLong,"malformedXml":$var_malformedXml,"redirectInvalid":$var_redirectInvalid,"priceMissing":$var_priceMissing,"feedTooSmall":$var_feedTooSmall,"conditionInvalid":$var_conditionInvalid,"shopifyNoProducts":$var_shopifyNoProducts,"maxItemsPerItemGroupExceeded":$var_maxItemsPerItemGroupExceeded,"itemMainImageDownloadFailure":$var_itemMainImageDownloadFailure,"pinjoinContentUnsafe":$var_pinjoinContentUnsafe,"blocklistedImageSignature":$var_blocklistedImageSignature
        | }
        """.stripMargin
}
