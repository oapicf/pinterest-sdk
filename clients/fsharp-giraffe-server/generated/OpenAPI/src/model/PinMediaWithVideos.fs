namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PinMedia
open OpenAPI.Model.VideoMetadata

module PinMediaWithVideos =

  //#region PinMediaWithVideos


  type PinMediaWithVideos = {
    Items : VideoMetadata[];
  }
  //#endregion
