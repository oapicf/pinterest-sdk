namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemAttributesRequestAllOfImageLink
open OpenAPI.Model.UpdatableItemAttributesGtin
open OpenAPI.Model.bool option
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module ItemAttributesRequest =

  //#region ItemAttributesRequest

  [<CLIMutable>]
  type ItemAttributesRequest = {
    [<JsonProperty(PropertyName = "ad_image_0_link")>]
    AdImage0Link : string option;
    [<JsonProperty(PropertyName = "ad_image_0_tag")>]
    AdImage0Tag : string option;
    [<JsonProperty(PropertyName = "ad_image_10_link")>]
    AdImage10Link : string option;
    [<JsonProperty(PropertyName = "ad_image_10_tag")>]
    AdImage10Tag : string option;
    [<JsonProperty(PropertyName = "ad_image_11_link")>]
    AdImage11Link : string option;
    [<JsonProperty(PropertyName = "ad_image_11_tag")>]
    AdImage11Tag : string option;
    [<JsonProperty(PropertyName = "ad_image_12_link")>]
    AdImage12Link : string option;
    [<JsonProperty(PropertyName = "ad_image_12_tag")>]
    AdImage12Tag : string option;
    [<JsonProperty(PropertyName = "ad_image_13_link")>]
    AdImage13Link : string option;
    [<JsonProperty(PropertyName = "ad_image_13_tag")>]
    AdImage13Tag : string option;
    [<JsonProperty(PropertyName = "ad_image_14_link")>]
    AdImage14Link : string option;
    [<JsonProperty(PropertyName = "ad_image_14_tag")>]
    AdImage14Tag : string option;
    [<JsonProperty(PropertyName = "ad_image_15_link")>]
    AdImage15Link : string option;
    [<JsonProperty(PropertyName = "ad_image_15_tag")>]
    AdImage15Tag : string option;
    [<JsonProperty(PropertyName = "ad_image_16_link")>]
    AdImage16Link : string option;
    [<JsonProperty(PropertyName = "ad_image_16_tag")>]
    AdImage16Tag : string option;
    [<JsonProperty(PropertyName = "ad_image_17_link")>]
    AdImage17Link : string option;
    [<JsonProperty(PropertyName = "ad_image_17_tag")>]
    AdImage17Tag : string option;
    [<JsonProperty(PropertyName = "ad_image_18_link")>]
    AdImage18Link : string option;
    [<JsonProperty(PropertyName = "ad_image_18_tag")>]
    AdImage18Tag : string option;
    [<JsonProperty(PropertyName = "ad_image_19_link")>]
    AdImage19Link : string option;
    [<JsonProperty(PropertyName = "ad_image_19_tag")>]
    AdImage19Tag : string option;
    [<JsonProperty(PropertyName = "ad_image_1_link")>]
    AdImage1Link : string option;
    [<JsonProperty(PropertyName = "ad_image_1_tag")>]
    AdImage1Tag : string option;
    [<JsonProperty(PropertyName = "ad_image_2_link")>]
    AdImage2Link : string option;
    [<JsonProperty(PropertyName = "ad_image_2_tag")>]
    AdImage2Tag : string option;
    [<JsonProperty(PropertyName = "ad_image_3_link")>]
    AdImage3Link : string option;
    [<JsonProperty(PropertyName = "ad_image_3_tag")>]
    AdImage3Tag : string option;
    [<JsonProperty(PropertyName = "ad_image_4_link")>]
    AdImage4Link : string option;
    [<JsonProperty(PropertyName = "ad_image_4_tag")>]
    AdImage4Tag : string option;
    [<JsonProperty(PropertyName = "ad_image_5_link")>]
    AdImage5Link : string option;
    [<JsonProperty(PropertyName = "ad_image_5_tag")>]
    AdImage5Tag : string option;
    [<JsonProperty(PropertyName = "ad_image_6_link")>]
    AdImage6Link : string option;
    [<JsonProperty(PropertyName = "ad_image_6_tag")>]
    AdImage6Tag : string option;
    [<JsonProperty(PropertyName = "ad_image_7_link")>]
    AdImage7Link : string option;
    [<JsonProperty(PropertyName = "ad_image_7_tag")>]
    AdImage7Tag : string option;
    [<JsonProperty(PropertyName = "ad_image_8_link")>]
    AdImage8Link : string option;
    [<JsonProperty(PropertyName = "ad_image_8_tag")>]
    AdImage8Tag : string option;
    [<JsonProperty(PropertyName = "ad_image_9_link")>]
    AdImage9Link : string option;
    [<JsonProperty(PropertyName = "ad_image_9_tag")>]
    AdImage9Tag : string option;
    [<JsonProperty(PropertyName = "ad_link")>]
    AdLink : string option;
    [<JsonProperty(PropertyName = "ad_video_0_link")>]
    AdVideo0Link : string option;
    [<JsonProperty(PropertyName = "ad_video_0_tag")>]
    AdVideo0Tag : string option;
    [<JsonProperty(PropertyName = "ad_video_1_link")>]
    AdVideo1Link : string option;
    [<JsonProperty(PropertyName = "ad_video_1_tag")>]
    AdVideo1Tag : string option;
    [<JsonProperty(PropertyName = "ad_video_2_link")>]
    AdVideo2Link : string option;
    [<JsonProperty(PropertyName = "ad_video_2_tag")>]
    AdVideo2Tag : string option;
    [<JsonProperty(PropertyName = "adult")>]
    Adult : bool option;
    [<JsonProperty(PropertyName = "age_group")>]
    AgeGroup : string option;
    [<JsonProperty(PropertyName = "android_deep_link")>]
    AndroidDeepLink : string;
    [<JsonProperty(PropertyName = "availability")>]
    Availability : string;
    [<JsonProperty(PropertyName = "average_review_rating")>]
    AverageReviewRating : decimal option;
    [<JsonProperty(PropertyName = "brand")>]
    Brand : string option;
    [<JsonProperty(PropertyName = "checkout_enabled")>]
    CheckoutEnabled : bool option;
    [<JsonProperty(PropertyName = "color")>]
    Color : string option;
    [<JsonProperty(PropertyName = "condition")>]
    Condition : string option;
    [<JsonProperty(PropertyName = "custom_label_0")>]
    CustomLabel0 : string option;
    [<JsonProperty(PropertyName = "custom_label_1")>]
    CustomLabel1 : string option;
    [<JsonProperty(PropertyName = "custom_label_2")>]
    CustomLabel2 : string option;
    [<JsonProperty(PropertyName = "custom_label_3")>]
    CustomLabel3 : string option;
    [<JsonProperty(PropertyName = "custom_label_4")>]
    CustomLabel4 : string option;
    [<JsonProperty(PropertyName = "custom_number_0")>]
    CustomNumber0 : int option;
    [<JsonProperty(PropertyName = "custom_number_1")>]
    CustomNumber1 : int option;
    [<JsonProperty(PropertyName = "custom_number_2")>]
    CustomNumber2 : int option;
    [<JsonProperty(PropertyName = "custom_number_3")>]
    CustomNumber3 : int option;
    [<JsonProperty(PropertyName = "custom_number_4")>]
    CustomNumber4 : int option;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "free_shipping_label")>]
    FreeShippingLabel : bool option;
    [<JsonProperty(PropertyName = "free_shipping_limit")>]
    FreeShippingLimit : string option;
    [<JsonProperty(PropertyName = "gender")>]
    Gender : string option;
    [<JsonProperty(PropertyName = "google_product_category")>]
    GoogleProductCategory : string option;
    [<JsonProperty(PropertyName = "gtin")>]
    Gtin : UpdatableItemAttributesGtin;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "installment_price")>]
    InstallmentPrice : string option;
    [<JsonProperty(PropertyName = "ios_deep_link")>]
    IosDeepLink : string;
    [<JsonProperty(PropertyName = "item_group_id")>]
    ItemGroupId : string option;
    [<JsonProperty(PropertyName = "last_updated_time")>]
    LastUpdatedTime : int64;
    [<JsonProperty(PropertyName = "link")>]
    Link : string;
    [<JsonProperty(PropertyName = "material")>]
    Material : string option;
    [<JsonProperty(PropertyName = "min_ad_price")>]
    MinAdPrice : string option;
    [<JsonProperty(PropertyName = "mobile_link")>]
    MobileLink : string option;
    [<JsonProperty(PropertyName = "mpn")>]
    Mpn : string option;
    [<JsonProperty(PropertyName = "number_of_ratings")>]
    NumberOfRatings : int option;
    [<JsonProperty(PropertyName = "number_of_reviews")>]
    NumberOfReviews : int option;
    [<JsonProperty(PropertyName = "pattern")>]
    Pattern : string option;
    [<JsonProperty(PropertyName = "price")>]
    Price : string;
    [<JsonProperty(PropertyName = "product_type")>]
    ProductType : string option;
    [<JsonProperty(PropertyName = "promotion_id")>]
    PromotionId : string option;
    [<JsonProperty(PropertyName = "sale_price")>]
    SalePrice : string option;
    [<JsonProperty(PropertyName = "sale_price_effective_date")>]
    SalePriceEffectiveDate : string option;
    [<JsonProperty(PropertyName = "shipping")>]
    Shipping : string option;
    [<JsonProperty(PropertyName = "shipping_height")>]
    ShippingHeight : string option;
    [<JsonProperty(PropertyName = "shipping_weight")>]
    ShippingWeight : string option;
    [<JsonProperty(PropertyName = "shipping_width")>]
    ShippingWidth : string option;
    [<JsonProperty(PropertyName = "size")>]
    Size : string option;
    [<JsonProperty(PropertyName = "size_system")>]
    SizeSystem : string option;
    [<JsonProperty(PropertyName = "size_type")>]
    SizeType : string option;
    [<JsonProperty(PropertyName = "tax")>]
    Tax : string option;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "unit_pricing_base_measure")>]
    UnitPricingBaseMeasure : string option;
    [<JsonProperty(PropertyName = "unit_pricing_measure")>]
    UnitPricingMeasure : string option;
    [<JsonProperty(PropertyName = "variant_names")>]
    VariantNames : string[];
    [<JsonProperty(PropertyName = "variant_values")>]
    VariantValues : string[];
    [<JsonProperty(PropertyName = "additional_image_link")>]
    AdditionalImageLink : string[];
    [<JsonProperty(PropertyName = "image_link")>]
    ImageLink : ItemAttributesRequestAllOfImageLink;
    [<JsonProperty(PropertyName = "save_pin_disabled")>]
    SavePinDisabled : bool;
    [<JsonProperty(PropertyName = "video_link")>]
    VideoLink : string option;
  }

  //#endregion
