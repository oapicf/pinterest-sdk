namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DynamicTitlesProcessCSVCreate =

  //#region DynamicTitlesProcessCSVCreate

  [<CLIMutable>]
  type DynamicTitlesProcessCSVCreate = {
    [<JsonProperty(PropertyName = "request_id")>]
    RequestId : string;
  }

  //#endregion
