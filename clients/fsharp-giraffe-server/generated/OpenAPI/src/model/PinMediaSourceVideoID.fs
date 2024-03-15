namespace OpenAPI.Model

open System
open System.Collections.Generic

module PinMediaSourceVideoID =

  //#region PinMediaSourceVideoID

  //#region enums
  type SourceTypeEnum = VideoIdEnum of string  
  //#endregion
  //#region enums
  type CoverImageContentTypeEnum = JpegEnum of string  |  PngEnum of string  
  //#endregion

  type PinMediaSourceVideoID = {
    SourceType : SourceTypeEnum;
    CoverImageUrl : string;
    CoverImageContentType : CoverImageContentTypeEnum;
    CoverImageData : string;
    MediaId : string;
    IsStandard : bool;
  }
  //#endregion
