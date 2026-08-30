namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DynamicTitlesProcessCSVError =

  //#region DynamicTitlesProcessCSVError

  [<CLIMutable>]
  type DynamicTitlesProcessCSVError = {
    [<JsonProperty(PropertyName = "error_type")>]
    ErrorType : string;
    [<JsonProperty(PropertyName = "row_number")>]
    RowNumber : int;
  }

  //#endregion
