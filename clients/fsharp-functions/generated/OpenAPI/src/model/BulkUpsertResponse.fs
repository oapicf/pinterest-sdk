namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BulkUpsertResponse =

  //#region BulkUpsertResponse

  [<CLIMutable>]
  type BulkUpsertResponse = {
    [<JsonProperty(PropertyName = "request_id")>]
    RequestId : string;
  }

  //#endregion
