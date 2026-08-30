namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.DynamicTitlesProcessCSVError

module DynamicTitlesProcessCSV =

  //#region DynamicTitlesProcessCSV

  [<CLIMutable>]
  type DynamicTitlesProcessCSV = {
    [<JsonProperty(PropertyName = "errors")>]
    Errors : DynamicTitlesProcessCSVError[];
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
  }

  //#endregion
