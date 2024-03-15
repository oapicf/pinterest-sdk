namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrderLine
open OpenAPI.Model.string option

module OrderLinesList200Response =

  //#region OrderLinesList200Response

  [<CLIMutable>]
  type OrderLinesList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : OrderLine[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
