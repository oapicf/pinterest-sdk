namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ItemAttributes =

  //#region ItemAttributes

  [<CLIMutable>]
  type ItemAttributes = {
    [<JsonProperty(PropertyName = "ad_link")>]
    AdLink : string;
    [<JsonProperty(PropertyName = "additional_image_link")>]
    AdditionalImageLink : string[];
    [<JsonProperty(PropertyName = "adult")>]
    Adult : bool;
    [<JsonProperty(PropertyName = "age_group")>]
    AgeGroup : string;
    [<JsonProperty(PropertyName = "availability")>]
    Availability : string;
    [<JsonProperty(PropertyName = "average_review_rating")>]
    AverageReviewRating : decimal;
    [<JsonProperty(PropertyName = "brand")>]
    Brand : string;
    [<JsonProperty(PropertyName = "color")>]
    Color : string;
    [<JsonProperty(PropertyName = "condition")>]
    Condition : string;
    [<JsonProperty(PropertyName = "custom_label_0")>]
    CustomLabel0 : string;
    [<JsonProperty(PropertyName = "custom_label_1")>]
    CustomLabel1 : string;
    [<JsonProperty(PropertyName = "custom_label_2")>]
    CustomLabel2 : string;
    [<JsonProperty(PropertyName = "custom_label_3")>]
    CustomLabel3 : string;
    [<JsonProperty(PropertyName = "custom_label_4")>]
    CustomLabel4 : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "free_shipping_label")>]
    FreeShippingLabel : bool;
    [<JsonProperty(PropertyName = "free_shipping_limit")>]
    FreeShippingLimit : string;
    [<JsonProperty(PropertyName = "gender")>]
    Gender : string;
    [<JsonProperty(PropertyName = "google_product_category")>]
    GoogleProductCategory : string;
    [<JsonProperty(PropertyName = "gtin")>]
    Gtin : int;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "image_link")>]
    ImageLink : string[];
    [<JsonProperty(PropertyName = "item_group_id")>]
    ItemGroupId : string;
    [<JsonProperty(PropertyName = "last_updated_time")>]
    LastUpdatedTime : int64;
    [<JsonProperty(PropertyName = "link")>]
    Link : string;
    [<JsonProperty(PropertyName = "material")>]
    Material : string;
    [<JsonProperty(PropertyName = "min_ad_price")>]
    MinAdPrice : string;
    [<JsonProperty(PropertyName = "mobile_link")>]
    MobileLink : string;
    [<JsonProperty(PropertyName = "mpn")>]
    Mpn : string;
    [<JsonProperty(PropertyName = "number_of_ratings")>]
    NumberOfRatings : int;
    [<JsonProperty(PropertyName = "number_of_reviews")>]
    NumberOfReviews : int;
    [<JsonProperty(PropertyName = "pattern")>]
    Pattern : string;
    [<JsonProperty(PropertyName = "price")>]
    Price : string;
    [<JsonProperty(PropertyName = "product_type")>]
    ProductType : string;
    [<JsonProperty(PropertyName = "sale_price")>]
    SalePrice : string;
    [<JsonProperty(PropertyName = "shipping")>]
    Shipping : string;
    [<JsonProperty(PropertyName = "shipping_height")>]
    ShippingHeight : string;
    [<JsonProperty(PropertyName = "shipping_weight")>]
    ShippingWeight : string;
    [<JsonProperty(PropertyName = "shipping_width")>]
    ShippingWidth : string;
    [<JsonProperty(PropertyName = "size")>]
    Size : string;
    [<JsonProperty(PropertyName = "size_system")>]
    SizeSystem : string;
    [<JsonProperty(PropertyName = "size_type")>]
    SizeType : string;
    [<JsonProperty(PropertyName = "tax")>]
    Tax : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
  }

  //#endregion
