namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BulkRequestStatus

module BulkJobData =

  //#region BulkJobData

  [<CLIMutable>]
  type BulkJobData = {
    [<JsonProperty(PropertyName = "result_url")>]
    ResultUrl : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : BulkRequestStatus;
    [<JsonProperty(PropertyName = "workload_id")>]
    WorkloadId : int;
  }

  //#endregion
