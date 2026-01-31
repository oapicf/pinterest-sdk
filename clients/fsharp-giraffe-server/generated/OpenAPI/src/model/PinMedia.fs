namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ImageSize
open OpenAPI.Model.PinMediaMetadata
open OpenAPI.Model.PinMediaWithImage
open OpenAPI.Model.PinMediaWithImageAndVideo
open OpenAPI.Model.PinMediaWithImages
open OpenAPI.Model.PinMediaWithVideo
open OpenAPI.Model.PinMediaWithVideos
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module PinMedia =

  //#region PinMedia

  //#region enums
  type MediaTypeEnum = MultipleMixedEnum of string  
  //#endregion

  type PinMedia = {
    Images : ImageSize;
    MediaType : MediaTypeEnum;
    CoverImageUrl : string;
    Duration : decimal option;
    Height : int option;
    VideoUrl : string option;
    Width : int option;
    Items : PinMediaMetadata[];
  }
  //#endregion
