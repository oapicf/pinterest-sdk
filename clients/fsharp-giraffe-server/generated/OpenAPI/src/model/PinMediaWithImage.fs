namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ImageSize

module PinMediaWithImage =

  //#region PinMediaWithImage

  //#region enums
  type MediaTypeEnum = ImageEnum of string  
  //#endregion

  type PinMediaWithImage = {
    Images : ImageSize;
    MediaType : MediaTypeEnum;
  }
  //#endregion
