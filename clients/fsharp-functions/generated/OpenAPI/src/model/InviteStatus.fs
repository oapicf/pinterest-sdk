namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module InviteStatus =

  //#region InviteStatus

  let PENDINGEnum = "PENDING"
  let ACCEPTEDEnum = "ACCEPTED"
  let DECLINEDEnum = "DECLINED"
  let CANCELLEDEnum = "CANCELLED"
  let EXPIREDEnum = "EXPIRED"
  type InviteStatus = string

  //#endregion
