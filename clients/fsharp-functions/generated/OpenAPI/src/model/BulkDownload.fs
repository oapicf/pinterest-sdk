namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BulkDownload =

  //#region BulkDownload

  [<CLIMutable>]
  type BulkDownload = {
    [<JsonProperty(PropertyName = "request_id")>]
    RequestId : string;
  }

  //#endregion
