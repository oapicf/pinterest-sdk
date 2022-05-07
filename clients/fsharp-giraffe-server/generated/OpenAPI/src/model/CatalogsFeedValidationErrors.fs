namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsFeedValidationErrors =

  //#region CatalogsFeedValidationErrors


  type CatalogsFeedValidationErrors = {
    FetchError : int;
    FetchInactiveFeedError : int;
    EncodingError : int;
    DelimiterError : int;
    RequiredColumnsMissing : int;
    ImageLinkInvalid : int;
    ItemidMissing : int;
    TitleMissing : int;
    DescriptionMissing : int;
    ProductCategoryInvalid : int;
    ProductLinkMissing : int;
    ImageLinkMissing : int;
    AvailabilityInvalid : int;
    ProductPriceInvalid : int;
    LinkFormatInvalid : int;
    ParseLineError : int;
    AdwordsFormatInvalid : int;
    ProductCategoryMissing : int;
    InternalServiceError : int;
    NoVerifiedDomain : int;
    AdultInvalid : int;
    InvalidDomain : int;
    FeedLengthTooLong : int;
    LinkLengthTooLong : int;
    MalformedXml : int;
    RedirectInvalid : int;
    PriceMissing : int;
    FeedTooSmall : int;
    ConditionInvalid : int;
    ShopifyNoProducts : int;
    MaxItemsPerItemGroupExceeded : int;
    ItemMainImageDownloadFailure : int;
    PinjoinContentUnsafe : int;
    BlocklistedImageSignature : int;
  }
  //#endregion
