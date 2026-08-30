namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BillingType =

  //#region BillingType

  let CREDITCARDEnum = "CREDIT_CARD"
  let INVOICEEnum = "INVOICE"
  let INTERNALEnum = "INTERNAL"
  let RECURRINGEnum = "RECURRING"
  let PREPAIDEnum = "PREPAID"
  type BillingType = string

  //#endregion
