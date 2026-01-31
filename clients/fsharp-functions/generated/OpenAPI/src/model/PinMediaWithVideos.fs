namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.VideoMetadataWithItemType

module PinMediaWithVideos =

  //#region PinMediaWithVideos

  [<CLIMutable>]
  type PinMediaWithVideos = {
    [<JsonProperty(PropertyName = "items")>]
    Items : VideoMetadataWithItemType[];
    [<JsonProperty(PropertyName = "media_type")>]
    MediaType : string;
  }

  //#endregion
