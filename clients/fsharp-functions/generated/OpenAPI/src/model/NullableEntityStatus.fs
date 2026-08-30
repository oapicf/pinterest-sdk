namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module NullableEntityStatus =

  //#region NullableEntityStatus

  let ACTIVEEnum = "ACTIVE"
  let PAUSEDEnum = "PAUSED"
  let ARCHIVEDEnum = "ARCHIVED"
  let DRAFTEnum = "DRAFT"
  let DELETEDDRAFTEnum = "DELETED_DRAFT"
  type NullableEntityStatus = string

  //#endregion
