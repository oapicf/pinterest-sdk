namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BulkUpsertStatus =

  //#region BulkUpsertStatus

  let RUNNINGEnum = "RUNNING"
  let SUCCEEDEDEnum = "SUCCEEDED"
  let FAILEDEnum = "FAILED"
  type BulkUpsertStatus = string

  //#endregion
