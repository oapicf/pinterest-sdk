namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module VideoMetadataWithItemType =

  //#region VideoMetadataWithItemType


  type VideoMetadataWithItemType = {
    CoverImageUrl : string;
    Duration : decimal option;
    Height : int option;
    ItemType : string;
    VideoUrl : string option;
    Width : int option;
  }
  //#endregion
