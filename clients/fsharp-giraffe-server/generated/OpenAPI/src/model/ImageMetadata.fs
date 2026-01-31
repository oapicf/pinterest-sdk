namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ImageSize
open OpenAPI.Model.string option

module ImageMetadata =

  //#region ImageMetadata


  type ImageMetadata = {
    Description : string option;
    Images : ImageSize;
    ItemType : string;
    Link : string option;
    Title : string option;
  }
  //#endregion
