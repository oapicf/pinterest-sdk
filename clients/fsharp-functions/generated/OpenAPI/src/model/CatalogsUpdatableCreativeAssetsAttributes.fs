namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module CatalogsUpdatableCreativeAssetsAttributes =

  //#region CatalogsUpdatableCreativeAssetsAttributes

  [<CLIMutable>]
  type CatalogsUpdatableCreativeAssetsAttributes = {
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "link")>]
    Link : string;
    [<JsonProperty(PropertyName = "ios_deep_link")>]
    IosDeepLink : string option;
    [<JsonProperty(PropertyName = "android_deep_link")>]
    AndroidDeepLink : string option;
    [<JsonProperty(PropertyName = "google_product_category")>]
    GoogleProductCategory : string option;
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
    [<JsonProperty(PropertyName = "visibility")>]
    Visibility : string option;
  }

  //#endregion
