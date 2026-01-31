namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MediaUploadType

module MediaUploadCreate =

  //#region MediaUploadCreate

  [<CLIMutable>]
  type MediaUploadCreate = {
    [<JsonProperty(PropertyName = "media_type")>]
    MediaType : MediaUploadType;
  }

  //#endregion
