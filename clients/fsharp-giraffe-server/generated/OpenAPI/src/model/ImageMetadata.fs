namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ImageMetadataImages
open OpenAPI.Model.string option

module ImageMetadata =

  //#region ImageMetadata


  type ImageMetadata = {
    ItemType : string;
    Title : string option;
    Description : string option;
    Link : string option;
    Images : ImageMetadataImages;
  }
  //#endregion
