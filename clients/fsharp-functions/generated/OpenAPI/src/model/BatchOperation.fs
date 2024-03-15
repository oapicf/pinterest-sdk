namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BatchOperation =

  //#region BatchOperation

  let UPDATEEnum = "UPDATE"
  let UPSERTEnum = "UPSERT"
  let CREATEEnum = "CREATE"
  let DELETEDISCONTINUEDEnum = "DELETE_DISCONTINUED"
  let DELETEEnum = "DELETE"
  type BatchOperation = string

  //#endregion
