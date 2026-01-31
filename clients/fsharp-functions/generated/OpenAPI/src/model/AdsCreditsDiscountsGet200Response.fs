namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdsCreditDiscountsResponse
open OpenAPI.Model.string option

module AdsCreditsDiscountsGet200Response =

  //#region AdsCreditsDiscountsGet200Response

  [<CLIMutable>]
  type AdsCreditsDiscountsGet200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : AdsCreditDiscountsResponse[];
  }

  //#endregion
