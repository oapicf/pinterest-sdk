namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BatchOperation =

  //#region BatchOperation

  let UPDATEEnum = "UPDATE"
  let CREATEEnum = "CREATE"
  let UPSERTEnum = "UPSERT"
  type BatchOperation = string

  //#endregion
