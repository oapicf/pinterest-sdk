namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BatchOperationStatus =

  //#region BatchOperationStatus

  let PROCESSINGEnum = "PROCESSING"
  let COMPLETEDEnum = "COMPLETED"
  let FAILEDEnum = "FAILED"
  type BatchOperationStatus = string

  //#endregion
