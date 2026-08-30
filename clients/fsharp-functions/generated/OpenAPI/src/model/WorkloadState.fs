namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module WorkloadState =

  //#region WorkloadState

  let NOTSTARTEDEnum = "NOT_STARTED"
  let RUNNINGEnum = "RUNNING"
  let PAUSEDEnum = "PAUSED"
  let SUCCEEDEDEnum = "SUCCEEDED"
  let FAILEDEnum = "FAILED"
  type WorkloadState = string

  //#endregion
