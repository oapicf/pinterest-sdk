namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsFeedValidationWarnings =

  //#region CatalogsFeedValidationWarnings


  type CatalogsFeedValidationWarnings = {
    TitleLengthTooLong : int;
    DescriptionLengthTooLong : int;
    GenderInvalid : int;
    AgeGroupInvalid : int;
    SizeTypeInvalid : int;
    LinkFormatWarning : int;
    DuplicateProducts : int;
    DuplicateLinks : int;
    SalesPriceInvalid : int;
    ProductCategoryDepthWarning : int;
    AdwordsSameAsLink : int;
    DuplicateHeaders : int;
    FetchSameSignature : int;
    AdwordsFormatWarning : int;
    AdditionalImageLinkWarning : int;
    ImageLinkWarning : int;
    ShippingInvalid : int;
    TaxInvalid : int;
    ShippingWeightInvalid : int;
    ExpirationDateInvalid : int;
    AvailabilityDateInvalid : int;
    SaleDateInvalid : int;
    WeightUnitInvalid : int;
    IsBundleInvalid : int;
    UpdatedTimeInvalid : int;
    CustomLabelLengthTooLong : int;
    ProductTypeLengthTooLong : int;
    TooManyAdditionalImageLinks : int;
    MultipackInvalid : int;
    IndexedProductCountLargeDelta : int;
    ItemAdditionalImageDownloadFailure : int;
    OptionalProductCategoryMissing : int;
    OptionalProductCategoryInvalid : int;
    OptionalConditionMissing : int;
    OptionalConditionInvalid : int;
    IosDeepLinkInvalid : int;
    AndroidDeepLinkInvalid : int;
    AvailabilityNormalized : int;
    ConditionNormalized : int;
    GenderNormalized : int;
    SizeTypeNormalized : int;
    AgeGroupNormalized : int;
    UtmSourceAutoCorrected : int;
    CountryDoesNotMapToCurrency : int;
    MinAdPriceInvalid : int;
  }
  //#endregion
