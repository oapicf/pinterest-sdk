namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ImageMetadata

module PinMediaWithImages =

  //#region PinMediaWithImages

  //#region enums
  type MediaTypeEnum = MultipleImagesEnum of string  
  //#endregion

  type PinMediaWithImages = {
    Items : ImageMetadata[];
    MediaType : MediaTypeEnum;
  }
  //#endregion
