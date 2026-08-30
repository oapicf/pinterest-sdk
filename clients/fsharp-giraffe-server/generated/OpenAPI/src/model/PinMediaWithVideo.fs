namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ImageSize
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module PinMediaWithVideo =

  //#region PinMediaWithVideo

  //#region enums
  type MediaTypeEnum = VideoEnum of string  
  //#endregion

  type PinMediaWithVideo = {
    CoverImageUrl : string;
    Duration : decimal option;
    Height : int option;
    Images : ImageSize;
    MediaType : MediaTypeEnum;
    VideoUrl : string option;
    VideoUrlHls : string option;
    Width : int option;
  }
  //#endregion
