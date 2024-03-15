namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.bool option
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module UpdatableItemAttributes =

  //#region UpdatableItemAttributes

  [<CLIMutable>]
  type UpdatableItemAttributes = {
    [<JsonProperty(PropertyName = "ad_link")>]
    AdLink : string option;
    [<JsonProperty(PropertyName = "adult")>]
    Adult : bool option;
    [<JsonProperty(PropertyName = "age_group")>]
    AgeGroup : string option;
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
    Gtin : int option;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
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
    [<JsonProperty(PropertyName = "sale_price")>]
    SalePrice : string option;
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
    [<JsonProperty(PropertyName = "variant_names")>]
    VariantNames : string[];
    [<JsonProperty(PropertyName = "variant_values")>]
    VariantValues : string[];
  }

  //#endregion
