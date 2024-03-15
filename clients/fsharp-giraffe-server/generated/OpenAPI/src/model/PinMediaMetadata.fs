namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ImageMetadata
open OpenAPI.Model.ImageMetadataImages
open OpenAPI.Model.VideoMetadata
open OpenAPI.Model.string option

module PinMediaMetadata =

  //#region PinMediaMetadata


  type PinMediaMetadata = {
    ItemType : string;
    Title : string option;
    Description : string option;
    Link : string option;
    Images : ImageMetadataImages;
    CoverImageUrl : string;
    VideoUrl : string option;
    Duration : decimal;
    Height : int;
    Width : int;
  }
  //#endregion
