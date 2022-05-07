namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PinMediaSourceImageBase64
open OpenAPI.Model.PinMediaSourceImageURL
open OpenAPI.Model.PinMediaSourceVideoID

module PinMediaSource =

  //#region PinMediaSource

  //#region enums
  type SourceTypeEnum = VideoIdEnum of string  
  //#endregion
  //#region enums
  type ContentTypeEnum = JpegEnum of string  |  PngEnum of string  
  //#endregion

  type PinMediaSource = {
    SourceType : SourceTypeEnum;
    ContentType : ContentTypeEnum;
    Data : string;
    Url : string;
    CoverImageUrl : string;
    MediaId : string;
  }
  //#endregion
