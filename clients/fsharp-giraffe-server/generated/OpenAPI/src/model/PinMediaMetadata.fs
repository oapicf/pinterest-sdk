namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ImageMetadata
open OpenAPI.Model.ImageSize
open OpenAPI.Model.VideoMetadataWithItemType
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module PinMediaMetadata =

  //#region PinMediaMetadata

  //#region enums
  type ItemTypeEnum = VideoEnum of string  
  //#endregion

  type PinMediaMetadata = {
    Description : string option;
    Images : ImageSize;
    ItemType : ItemTypeEnum;
    Link : string option;
    Title : string option;
    CoverImageUrl : string;
    Duration : decimal option;
    Height : int option;
    VideoUrl : string option;
    VideoUrlHls : string option;
    Width : int option;
  }
  //#endregion
