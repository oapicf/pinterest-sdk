namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CustomerListStatus =

  //#region CustomerListStatus

  let PROCESSINGEnum = "PROCESSING"
  let READYEnum = "READY"
  let TOOSMALLEnum = "TOO_SMALL"
  let UPLOADINGEnum = "UPLOADING"
  type CustomerListStatus = string

  //#endregion
