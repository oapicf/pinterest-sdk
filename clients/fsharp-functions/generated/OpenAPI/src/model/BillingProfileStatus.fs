namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BillingProfileStatus =

  //#region BillingProfileStatus

  let UNSPECIFIEDEnum = "UNSPECIFIED"
  let VALIDEnum = "VALID"
  let INVALIDEnum = "INVALID"
  let PENDINGEnum = "PENDING"
  let DELETEDEnum = "DELETED"
  let SECONDARYEnum = "SECONDARY"
  let PENDINGSECONDARYEnum = "PENDING_SECONDARY"
  type BillingProfileStatus = string

  //#endregion
