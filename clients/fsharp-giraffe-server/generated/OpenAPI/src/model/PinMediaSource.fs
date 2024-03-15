namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PinMediaSourceImageBase64
open OpenAPI.Model.PinMediaSourceImageURL
open OpenAPI.Model.PinMediaSourceImagesBase64
open OpenAPI.Model.PinMediaSourceImagesURL
open OpenAPI.Model.PinMediaSourceImagesURLItemsInner
open OpenAPI.Model.PinMediaSourcePinURL
open OpenAPI.Model.PinMediaSourceVideoID

module PinMediaSource =

  //#region PinMediaSource

  //#region enums
  type SourceTypeEnum = PinUrlEnum of string  
  //#endregion
  //#region enums
  type ContentTypeEnum = JpegEnum of string  |  PngEnum of string  
  //#endregion
  //#region enums
  type CoverImageContentTypeEnum = JpegEnum of string  |  PngEnum of string  
  //#endregion

  type PinMediaSource = {
    SourceType : SourceTypeEnum;
    ContentType : ContentTypeEnum;
    Data : string;
    IsStandard : bool;
    Url : string;
    CoverImageUrl : string;
    CoverImageContentType : CoverImageContentTypeEnum;
    CoverImageData : string;
    MediaId : string;
    Items : PinMediaSourceImagesURLItemsInner[];
    Index : int;
    IsAffiliateLink : bool;
  }
  //#endregion
