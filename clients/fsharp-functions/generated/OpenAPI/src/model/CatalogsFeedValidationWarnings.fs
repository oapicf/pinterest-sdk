namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsFeedValidationWarnings =

  //#region CatalogsFeedValidationWarnings

  [<CLIMutable>]
  type CatalogsFeedValidationWarnings = {
    [<JsonProperty(PropertyName = "title_length_too_long")>]
    TitleLengthTooLong : int;
    [<JsonProperty(PropertyName = "description_length_too_long")>]
    DescriptionLengthTooLong : int;
    [<JsonProperty(PropertyName = "gender_invalid")>]
    GenderInvalid : int;
    [<JsonProperty(PropertyName = "age_group_invalid")>]
    AgeGroupInvalid : int;
    [<JsonProperty(PropertyName = "size_type_invalid")>]
    SizeTypeInvalid : int;
    [<JsonProperty(PropertyName = "link_format_warning")>]
    LinkFormatWarning : int;
    [<JsonProperty(PropertyName = "duplicate_products")>]
    DuplicateProducts : int;
    [<JsonProperty(PropertyName = "duplicate_links")>]
    DuplicateLinks : int;
    [<JsonProperty(PropertyName = "sales_price_invalid")>]
    SalesPriceInvalid : int;
    [<JsonProperty(PropertyName = "product_category_depth_warning")>]
    ProductCategoryDepthWarning : int;
    [<JsonProperty(PropertyName = "adwords_same_as_link")>]
    AdwordsSameAsLink : int;
    [<JsonProperty(PropertyName = "duplicate_headers")>]
    DuplicateHeaders : int;
    [<JsonProperty(PropertyName = "fetch_same_signature")>]
    FetchSameSignature : int;
    [<JsonProperty(PropertyName = "adwords_format_warning")>]
    AdwordsFormatWarning : int;
    [<JsonProperty(PropertyName = "additional_image_link_warning")>]
    AdditionalImageLinkWarning : int;
    [<JsonProperty(PropertyName = "image_link_warning")>]
    ImageLinkWarning : int;
    [<JsonProperty(PropertyName = "shipping_invalid")>]
    ShippingInvalid : int;
    [<JsonProperty(PropertyName = "tax_invalid")>]
    TaxInvalid : int;
    [<JsonProperty(PropertyName = "shipping_weight_invalid")>]
    ShippingWeightInvalid : int;
    [<JsonProperty(PropertyName = "expiration_date_invalid")>]
    ExpirationDateInvalid : int;
    [<JsonProperty(PropertyName = "availability_date_invalid")>]
    AvailabilityDateInvalid : int;
    [<JsonProperty(PropertyName = "sale_date_invalid")>]
    SaleDateInvalid : int;
    [<JsonProperty(PropertyName = "weight_unit_invalid")>]
    WeightUnitInvalid : int;
    [<JsonProperty(PropertyName = "is_bundle_invalid")>]
    IsBundleInvalid : int;
    [<JsonProperty(PropertyName = "updated_time_invalid")>]
    UpdatedTimeInvalid : int;
    [<JsonProperty(PropertyName = "custom_label_length_too_long")>]
    CustomLabelLengthTooLong : int;
    [<JsonProperty(PropertyName = "product_type_length_too_long")>]
    ProductTypeLengthTooLong : int;
    [<JsonProperty(PropertyName = "too_many_additional_image_links")>]
    TooManyAdditionalImageLinks : int;
    [<JsonProperty(PropertyName = "multipack_invalid")>]
    MultipackInvalid : int;
    [<JsonProperty(PropertyName = "indexed_product_count_large_delta")>]
    IndexedProductCountLargeDelta : int;
    [<JsonProperty(PropertyName = "item_additional_image_download_failure")>]
    ItemAdditionalImageDownloadFailure : int;
    [<JsonProperty(PropertyName = "optional_product_category_missing")>]
    OptionalProductCategoryMissing : int;
    [<JsonProperty(PropertyName = "optional_product_category_invalid")>]
    OptionalProductCategoryInvalid : int;
    [<JsonProperty(PropertyName = "optional_condition_missing")>]
    OptionalConditionMissing : int;
    [<JsonProperty(PropertyName = "optional_condition_invalid")>]
    OptionalConditionInvalid : int;
    [<JsonProperty(PropertyName = "ios_deep_link_invalid")>]
    IosDeepLinkInvalid : int;
    [<JsonProperty(PropertyName = "android_deep_link_invalid")>]
    AndroidDeepLinkInvalid : int;
    [<JsonProperty(PropertyName = "availability_normalized")>]
    AvailabilityNormalized : int;
    [<JsonProperty(PropertyName = "condition_normalized")>]
    ConditionNormalized : int;
    [<JsonProperty(PropertyName = "gender_normalized")>]
    GenderNormalized : int;
    [<JsonProperty(PropertyName = "size_type_normalized")>]
    SizeTypeNormalized : int;
    [<JsonProperty(PropertyName = "age_group_normalized")>]
    AgeGroupNormalized : int;
    [<JsonProperty(PropertyName = "utm_source_auto_corrected")>]
    UtmSourceAutoCorrected : int;
    [<JsonProperty(PropertyName = "country_does_not_map_to_currency")>]
    CountryDoesNotMapToCurrency : int;
    [<JsonProperty(PropertyName = "min_ad_price_invalid")>]
    MinAdPriceInvalid : int;
  }

  //#endregion
