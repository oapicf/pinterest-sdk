namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ScheduleStatus =

  //#region ScheduleStatus

  let DRAFTEnum = "DRAFT"
  let CREATEDEnum = "CREATED"
  let SCHEDULEDEnum = "SCHEDULED"
  let ACTIVEEnum = "ACTIVE"
  let COMPLETEDEnum = "COMPLETED"
  let FAILEDEnum = "FAILED"
  let CANCELEDEnum = "CANCELED"
  type ScheduleStatus = string

  //#endregion
