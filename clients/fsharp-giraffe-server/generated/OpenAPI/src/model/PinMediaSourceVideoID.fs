namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ContentType

module PinMediaSourceVideoID =

  //#region PinMediaSourceVideoID

  //#region enums
  type SourceTypeEnum = VideoIdEnum of string  
  //#endregion

  type PinMediaSourceVideoID = {
    CoverImageContentType : ContentType;
    CoverImageData : string;
    CoverImageKeyFrameTime : int;
    CoverImageUrl : string;
    IsStandard : bool;
    MediaId : string;
    SourceType : SourceTypeEnum;
  }
  //#endregion
