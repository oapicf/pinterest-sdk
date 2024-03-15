namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module EntityStatus =

  //#region EntityStatus

  let ACTIVEEnum = "ACTIVE"
  let PAUSEDEnum = "PAUSED"
  let ARCHIVEDEnum = "ARCHIVED"
  let DRAFTEnum = "DRAFT"
  let DELETEDDRAFTEnum = "DELETED_DRAFT"
  type EntityStatus = string

  //#endregion
