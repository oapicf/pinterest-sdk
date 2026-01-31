namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ContentType
open OpenAPI.Model.PinMediaSourceImageBase64
open OpenAPI.Model.PinMediaSourceImageURL
open OpenAPI.Model.PinMediaSourceImagesBase64
open OpenAPI.Model.PinMediaSourceImagesURL
open OpenAPI.Model.PinMediaSourceImagesURLItem
open OpenAPI.Model.PinMediaSourcePinURL
open OpenAPI.Model.PinMediaSourceVideoID

module PinMediaSource =

  //#region PinMediaSource

  //#region enums
  type SourceTypeEnum = PinUrlEnum of string  
  //#endregion

  type PinMediaSource = {
    ContentType : ContentType;
    Data : string;
    IsStandard : bool;
    SourceType : SourceTypeEnum;
    Url : string;
    CoverImageContentType : ContentType;
    CoverImageData : string;
    CoverImageKeyFrameTime : int;
    CoverImageUrl : string;
    MediaId : string;
    Index : int;
    Items : PinMediaSourceImagesURLItem[];
    IsAffiliateLink : bool;
  }
  //#endregion
