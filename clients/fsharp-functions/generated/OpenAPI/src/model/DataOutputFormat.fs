namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DataOutputFormat =

  //#region DataOutputFormat

  let JSONEnum = "JSON"
  let CSVEnum = "CSV"
  type DataOutputFormat = string

  //#endregion
