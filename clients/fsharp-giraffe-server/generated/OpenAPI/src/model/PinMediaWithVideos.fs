namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.VideoMetadataWithItemType

module PinMediaWithVideos =

  //#region PinMediaWithVideos

  //#region enums
  type MediaTypeEnum = MultipleVideosEnum of string  
  //#endregion

  type PinMediaWithVideos = {
    Items : VideoMetadataWithItemType[];
    MediaType : MediaTypeEnum;
  }
  //#endregion
