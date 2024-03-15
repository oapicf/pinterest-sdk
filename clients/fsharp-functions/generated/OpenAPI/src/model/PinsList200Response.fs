namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Pin
open OpenAPI.Model.string option

module PinsList200Response =

  //#region PinsList200Response

  [<CLIMutable>]
  type PinsList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : Pin[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
