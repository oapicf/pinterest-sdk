namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.S3FilePart

module S3MultipartUploadData =

  //#region S3MultipartUploadData

  [<CLIMutable>]
  type S3MultipartUploadData = {
    [<JsonProperty(PropertyName = "file_parts")>]
    FileParts : S3FilePart[];
  }

  //#endregion
