namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Promotion
open OpenAPI.Model.string option

module PromotionsList200Response =

  //#region PromotionsList200Response

  [<CLIMutable>]
  type PromotionsList200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : Promotion[];
  }

  //#endregion
