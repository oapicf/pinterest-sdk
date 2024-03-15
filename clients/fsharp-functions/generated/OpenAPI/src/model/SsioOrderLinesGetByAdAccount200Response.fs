namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.SSIOOrderLine
open OpenAPI.Model.string option

module SsioOrderLinesGetByAdAccount200Response =

  //#region SsioOrderLinesGetByAdAccount200Response

  [<CLIMutable>]
  type SsioOrderLinesGetByAdAccount200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : SSIOOrderLine[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
