namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsReportStats
open OpenAPI.Model.string option

module ReportsStats200Response =

  //#region ReportsStats200Response

  [<CLIMutable>]
  type ReportsStats200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : CatalogsReportStats[];
  }

  //#endregion
