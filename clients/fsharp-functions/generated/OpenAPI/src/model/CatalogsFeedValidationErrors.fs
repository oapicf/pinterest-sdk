namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsFeedValidationErrors =

  //#region CatalogsFeedValidationErrors

  [<CLIMutable>]
  type CatalogsFeedValidationErrors = {
    [<JsonProperty(PropertyName = "fetch_error")>]
    FetchError : int;
    [<JsonProperty(PropertyName = "fetch_inactive_feed_error")>]
    FetchInactiveFeedError : int;
    [<JsonProperty(PropertyName = "encoding_error")>]
    EncodingError : int;
    [<JsonProperty(PropertyName = "delimiter_error")>]
    DelimiterError : int;
    [<JsonProperty(PropertyName = "required_columns_missing")>]
    RequiredColumnsMissing : int;
    [<JsonProperty(PropertyName = "image_link_invalid")>]
    ImageLinkInvalid : int;
    [<JsonProperty(PropertyName = "itemid_missing")>]
    ItemidMissing : int;
    [<JsonProperty(PropertyName = "title_missing")>]
    TitleMissing : int;
    [<JsonProperty(PropertyName = "description_missing")>]
    DescriptionMissing : int;
    [<JsonProperty(PropertyName = "product_category_invalid")>]
    ProductCategoryInvalid : int;
    [<JsonProperty(PropertyName = "product_link_missing")>]
    ProductLinkMissing : int;
    [<JsonProperty(PropertyName = "image_link_missing")>]
    ImageLinkMissing : int;
    [<JsonProperty(PropertyName = "availability_invalid")>]
    AvailabilityInvalid : int;
    [<JsonProperty(PropertyName = "product_price_invalid")>]
    ProductPriceInvalid : int;
    [<JsonProperty(PropertyName = "link_format_invalid")>]
    LinkFormatInvalid : int;
    [<JsonProperty(PropertyName = "parse_line_error")>]
    ParseLineError : int;
    [<JsonProperty(PropertyName = "adwords_format_invalid")>]
    AdwordsFormatInvalid : int;
    [<JsonProperty(PropertyName = "product_category_missing")>]
    ProductCategoryMissing : int;
    [<JsonProperty(PropertyName = "internal_service_error")>]
    InternalServiceError : int;
    [<JsonProperty(PropertyName = "no_verified_domain")>]
    NoVerifiedDomain : int;
    [<JsonProperty(PropertyName = "adult_invalid")>]
    AdultInvalid : int;
    [<JsonProperty(PropertyName = "invalid_domain")>]
    InvalidDomain : int;
    [<JsonProperty(PropertyName = "feed_length_too_long")>]
    FeedLengthTooLong : int;
    [<JsonProperty(PropertyName = "link_length_too_long")>]
    LinkLengthTooLong : int;
    [<JsonProperty(PropertyName = "malformed_xml")>]
    MalformedXml : int;
    [<JsonProperty(PropertyName = "redirect_invalid")>]
    RedirectInvalid : int;
    [<JsonProperty(PropertyName = "price_missing")>]
    PriceMissing : int;
    [<JsonProperty(PropertyName = "feed_too_small")>]
    FeedTooSmall : int;
    [<JsonProperty(PropertyName = "condition_invalid")>]
    ConditionInvalid : int;
    [<JsonProperty(PropertyName = "shopify_no_products")>]
    ShopifyNoProducts : int;
    [<JsonProperty(PropertyName = "max_items_per_item_group_exceeded")>]
    MaxItemsPerItemGroupExceeded : int;
    [<JsonProperty(PropertyName = "item_main_image_download_failure")>]
    ItemMainImageDownloadFailure : int;
    [<JsonProperty(PropertyName = "pinjoin_content_unsafe")>]
    PinjoinContentUnsafe : int;
    [<JsonProperty(PropertyName = "blocklisted_image_signature")>]
    BlocklistedImageSignature : int;
  }

  //#endregion
