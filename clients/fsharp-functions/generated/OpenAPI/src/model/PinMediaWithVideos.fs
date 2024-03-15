namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PinMedia
open OpenAPI.Model.VideoMetadata

module PinMediaWithVideos =

  //#region PinMediaWithVideos

  [<CLIMutable>]
  type PinMediaWithVideos = {
    [<JsonProperty(PropertyName = "items")>]
    Items : VideoMetadata[];
  }

  //#endregion
