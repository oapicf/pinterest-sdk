namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdResponse
open OpenAPI.Model.string option

module AdsList200Response =

  //#region AdsList200Response

  [<CLIMutable>]
  type AdsList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : AdResponse[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
