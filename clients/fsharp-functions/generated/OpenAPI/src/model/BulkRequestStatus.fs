namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BulkRequestStatus =

  //#region BulkRequestStatus

  let RUNNINGEnum = "RUNNING"
  let SUCCEEDEDEnum = "SUCCEEDED"
  let FAILEDEnum = "FAILED"
  type BulkRequestStatus = string

  //#endregion
