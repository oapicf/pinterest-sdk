namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module AdsCreditDiscountsResponse =

  //#region AdsCreditDiscountsResponse

  [<CLIMutable>]
  type AdsCreditDiscountsResponse = {
    [<JsonProperty(PropertyName = "active")>]
    Active : bool;
    [<JsonProperty(PropertyName = "advertiser_id")>]
    AdvertiserId : string;
    [<JsonProperty(PropertyName = "discountType")>]
    DiscountType : string option;
    [<JsonProperty(PropertyName = "discountInMicroCurrency")>]
    DiscountInMicroCurrency : decimal option;
    [<JsonProperty(PropertyName = "discountCurrency")>]
    DiscountCurrency : string option;
    [<JsonProperty(PropertyName = "title")>]
    Title : string option;
    [<JsonProperty(PropertyName = "remainingDiscountInMicroCurrency")>]
    RemainingDiscountInMicroCurrency : decimal option;
  }

  //#endregion
