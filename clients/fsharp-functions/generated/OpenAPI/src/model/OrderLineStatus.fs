namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderLineStatus =

  //#region OrderLineStatus

  let ACTIVEEnum = "ACTIVE"
  let PAUSEDEnum = "PAUSED"
  let DELETEDEnum = "DELETED"
  type OrderLineStatus = string

  //#endregion
