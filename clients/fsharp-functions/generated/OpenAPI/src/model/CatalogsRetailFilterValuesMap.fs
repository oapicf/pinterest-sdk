namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsRetailFilterValuesMap =

  //#region CatalogsRetailFilterValuesMap

  [<CLIMutable>]
  type CatalogsRetailFilterValuesMap = {
    [<JsonProperty(PropertyName = "ad_image_tags")>]
    AdImageTags : string[];
    [<JsonProperty(PropertyName = "ad_video_tags")>]
    AdVideoTags : string[];
    [<JsonProperty(PropertyName = "availability")>]
    Availability : string[];
    [<JsonProperty(PropertyName = "brand")>]
    Brand : string[];
    [<JsonProperty(PropertyName = "condition")>]
    Condition : string[];
    [<JsonProperty(PropertyName = "custom_label_0")>]
    CustomLabel0 : string[];
    [<JsonProperty(PropertyName = "custom_label_1")>]
    CustomLabel1 : string[];
    [<JsonProperty(PropertyName = "custom_label_2")>]
    CustomLabel2 : string[];
    [<JsonProperty(PropertyName = "custom_label_3")>]
    CustomLabel3 : string[];
    [<JsonProperty(PropertyName = "custom_label_4")>]
    CustomLabel4 : string[];
    [<JsonProperty(PropertyName = "gender")>]
    Gender : string[];
    [<JsonProperty(PropertyName = "google_product_category_0")>]
    GoogleProductCategory0 : string[];
    [<JsonProperty(PropertyName = "google_product_category_1")>]
    GoogleProductCategory1 : string[];
    [<JsonProperty(PropertyName = "google_product_category_2")>]
    GoogleProductCategory2 : string[];
    [<JsonProperty(PropertyName = "google_product_category_3")>]
    GoogleProductCategory3 : string[];
    [<JsonProperty(PropertyName = "google_product_category_4")>]
    GoogleProductCategory4 : string[];
    [<JsonProperty(PropertyName = "google_product_category_5")>]
    GoogleProductCategory5 : string[];
    [<JsonProperty(PropertyName = "google_product_category_6")>]
    GoogleProductCategory6 : string[];
    [<JsonProperty(PropertyName = "media_type")>]
    MediaType : string[];
    [<JsonProperty(PropertyName = "product_type_0")>]
    ProductType0 : string[];
    [<JsonProperty(PropertyName = "product_type_1")>]
    ProductType1 : string[];
    [<JsonProperty(PropertyName = "product_type_2")>]
    ProductType2 : string[];
    [<JsonProperty(PropertyName = "product_type_3")>]
    ProductType3 : string[];
    [<JsonProperty(PropertyName = "product_type_4")>]
    ProductType4 : string[];
  }

  //#endregion
