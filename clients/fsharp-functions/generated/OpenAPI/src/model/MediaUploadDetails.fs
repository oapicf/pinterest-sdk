namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MediaUploadStatus
open OpenAPI.Model.MediaUploadType

module MediaUploadDetails =

  //#region MediaUploadDetails

  [<CLIMutable>]
  type MediaUploadDetails = {
    [<JsonProperty(PropertyName = "media_id")>]
    MediaId : string;
    [<JsonProperty(PropertyName = "media_type")>]
    MediaType : MediaUploadType;
    [<JsonProperty(PropertyName = "status")>]
    Status : MediaUploadStatus;
  }

  //#endregion
