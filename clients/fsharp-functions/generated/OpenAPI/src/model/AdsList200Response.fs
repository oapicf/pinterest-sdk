namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Ad
open OpenAPI.Model.string option

module AdsList200Response =

  //#region AdsList200Response

  [<CLIMutable>]
  type AdsList200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : Ad[];
  }

  //#endregion
