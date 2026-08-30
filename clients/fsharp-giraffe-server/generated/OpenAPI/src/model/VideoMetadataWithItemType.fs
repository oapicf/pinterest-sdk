namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module VideoMetadataWithItemType =

  //#region VideoMetadataWithItemType

  //#region enums
  type ItemTypeEnum = VideoEnum of string  
  //#endregion

  type VideoMetadataWithItemType = {
    CoverImageUrl : string;
    Duration : decimal option;
    Height : int option;
    ItemType : ItemTypeEnum;
    VideoUrl : string option;
    VideoUrlHls : string option;
    Width : int option;
  }
  //#endregion
