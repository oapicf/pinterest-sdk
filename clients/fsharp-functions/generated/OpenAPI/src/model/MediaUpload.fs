namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MediaUploadParameters
open OpenAPI.Model.MediaUploadType

module MediaUpload =

  //#region MediaUpload

  [<CLIMutable>]
  type MediaUpload = {
    [<JsonProperty(PropertyName = "media_id")>]
    MediaId : string;
    [<JsonProperty(PropertyName = "media_type")>]
    MediaType : MediaUploadType;
    [<JsonProperty(PropertyName = "upload_parameters")>]
    UploadParameters : MediaUploadParameters;
    [<JsonProperty(PropertyName = "upload_url")>]
    UploadUrl : string;
  }

  //#endregion
