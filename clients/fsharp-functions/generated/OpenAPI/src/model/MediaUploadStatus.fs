namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MediaUploadStatus =

  //#region MediaUploadStatus

  let RegisteredEnum = "registered"
  let ProcessingEnum = "processing"
  let SucceededEnum = "succeeded"
  let FailedEnum = "failed"
  type MediaUploadStatus = string

  //#endregion
