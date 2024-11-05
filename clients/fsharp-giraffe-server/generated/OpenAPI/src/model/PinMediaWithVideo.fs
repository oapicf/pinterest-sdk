namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PinMedia
open OpenAPI.Model.PinMediaWithImageAllOfImages
open OpenAPI.Model.string option

module PinMediaWithVideo =

  //#region PinMediaWithVideo


  type PinMediaWithVideo = {
    Images : PinMediaWithImageAllOfImages;
    CoverImageUrl : string;
    VideoUrl : string option;
    Duration : decimal;
    Height : int;
    Width : int;
  }
  //#endregion
