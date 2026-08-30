namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module IngestionSource =

  //#region IngestionSource

  let TAGEnum = "TAG"
  let MMPEnum = "MMP"
  let FILEUPLOADEnum = "FILE_UPLOAD"
  let CONVERSIONSAPIEnum = "CONVERSIONS_API"
  let NATIVEEnum = "NATIVE"
  type IngestionSource = string

  //#endregion
