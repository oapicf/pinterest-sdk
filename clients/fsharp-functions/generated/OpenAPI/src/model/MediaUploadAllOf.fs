namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MediaUploadAllOfUploadParameters
open OpenAPI.Model.MediaUploadType

module MediaUploadAllOf =

  //#region MediaUploadAllOf

  [<CLIMutable>]
  type MediaUploadAllOf = {
    [<JsonProperty(PropertyName = "media_id")>]
    MediaId : string;
    [<JsonProperty(PropertyName = "media_type")>]
    MediaType : MediaUploadType;
    [<JsonProperty(PropertyName = "upload_url")>]
    UploadUrl : string;
    [<JsonProperty(PropertyName = "upload_parameters")>]
    UploadParameters : MediaUploadAllOfUploadParameters;
  }

  //#endregion
