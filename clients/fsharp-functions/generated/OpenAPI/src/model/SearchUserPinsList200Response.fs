namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Pin
open OpenAPI.Model.string option

module SearchUserPinsList200Response =

  //#region SearchUserPinsList200Response

  [<CLIMutable>]
  type SearchUserPinsList200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : Pin[];
  }

  //#endregion
