namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MediaUploadType

module MediaUploadRequest =

  //#region MediaUploadRequest

  [<CLIMutable>]
  type MediaUploadRequest = {
    [<JsonProperty(PropertyName = "media_type")>]
    MediaType : MediaUploadType;
  }

  //#endregion
