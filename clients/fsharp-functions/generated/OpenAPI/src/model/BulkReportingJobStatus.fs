namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BulkReportingJobStatus =

  //#region BulkReportingJobStatus

  let DOESNOTEXISTEnum = "DOES_NOT_EXIST"
  let FINISHEDEnum = "FINISHED"
  let INPROGRESSEnum = "IN_PROGRESS"
  let EXPIREDEnum = "EXPIRED"
  let FAILEDEnum = "FAILED"
  let CANCELLEDEnum = "CANCELLED"
  type BulkReportingJobStatus = string

  //#endregion
