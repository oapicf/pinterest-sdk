namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MediaUploadDetails
open OpenAPI.Model.string option

module MediaList200Response =

  //#region MediaList200Response

  [<CLIMutable>]
  type MediaList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : MediaUploadDetails[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
