namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PinMediaMetadata

module PinMediaWithImageAndVideo =

  //#region PinMediaWithImageAndVideo

  //#region enums
  type MediaTypeEnum = MultipleMixedEnum of string  
  //#endregion

  type PinMediaWithImageAndVideo = {
    Items : PinMediaMetadata[];
    MediaType : MediaTypeEnum;
  }
  //#endregion
