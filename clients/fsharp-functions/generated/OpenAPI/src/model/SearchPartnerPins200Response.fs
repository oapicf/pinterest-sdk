namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.SummaryPin
open OpenAPI.Model.string option

module SearchPartnerPins200Response =

  //#region SearchPartnerPins200Response

  [<CLIMutable>]
  type SearchPartnerPins200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : SummaryPin[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
