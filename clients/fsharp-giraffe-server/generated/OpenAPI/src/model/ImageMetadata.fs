namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ImageSize
open OpenAPI.Model.string option

module ImageMetadata =

  //#region ImageMetadata

  //#region enums
  type ItemTypeEnum = ImageEnum of string  
  //#endregion

  type ImageMetadata = {
    Description : string option;
    Images : ImageSize;
    ItemType : ItemTypeEnum;
    Link : string option;
    Title : string option;
  }
  //#endregion
