namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DynamicTitlesUploadURL =

  //#region DynamicTitlesUploadURL

  [<CLIMutable>]
  type DynamicTitlesUploadURL = {
    [<JsonProperty(PropertyName = "existing_filename")>]
    ExistingFilename : string;
    [<JsonProperty(PropertyName = "request_id")>]
    RequestId : string;
    [<JsonProperty(PropertyName = "upload_url")>]
    UploadUrl : string;
  }

  //#endregion
