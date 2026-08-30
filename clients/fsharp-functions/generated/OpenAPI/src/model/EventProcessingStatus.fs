namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module EventProcessingStatus =

  //#region EventProcessingStatus

  let FailedEnum = "failed"
  let ProcessedEnum = "processed"
  type EventProcessingStatus = string

  //#endregion
