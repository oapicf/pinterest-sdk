namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module S3FilePart =

  //#region S3FilePart

  [<CLIMutable>]
  type S3FilePart = {
    [<JsonProperty(PropertyName = "part_number")>]
    PartNumber : int;
    [<JsonProperty(PropertyName = "presigned_url")>]
    PresignedUrl : string;
  }

  //#endregion
