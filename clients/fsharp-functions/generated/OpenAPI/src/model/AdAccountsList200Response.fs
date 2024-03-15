namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdAccount
open OpenAPI.Model.string option

module AdAccountsList200Response =

  //#region AdAccountsList200Response

  [<CLIMutable>]
  type AdAccountsList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : AdAccount[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
