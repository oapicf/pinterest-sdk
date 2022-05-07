namespace OpenAPI.Model

open System
open System.Collections.Generic

module PinMediaSourceVideoID =

  //#region PinMediaSourceVideoID

  //#region enums
  type SourceTypeEnum = VideoIdEnum of string  
  //#endregion

  type PinMediaSourceVideoID = {
    SourceType : SourceTypeEnum;
    CoverImageUrl : string;
    MediaId : string;
  }
  //#endregion
