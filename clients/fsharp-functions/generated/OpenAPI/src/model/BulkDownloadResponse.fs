namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BulkDownloadResponse =

  //#region BulkDownloadResponse

  [<CLIMutable>]
  type BulkDownloadResponse = {
    [<JsonProperty(PropertyName = "request_id")>]
    RequestId : string;
  }

  //#endregion
