namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BulkUpsertStatus

module BulkUpsertStatusResponse =

  //#region BulkUpsertStatusResponse

  [<CLIMutable>]
  type BulkUpsertStatusResponse = {
    [<JsonProperty(PropertyName = "result_url")>]
    ResultUrl : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : BulkUpsertStatus;
  }

  //#endregion
