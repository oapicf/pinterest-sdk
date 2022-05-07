namespace OpenAPI.Model

open System
open System.Collections.Generic

module PinMediaSourceImageURL =

  //#region PinMediaSourceImageURL

  //#region enums
  type SourceTypeEnum = ImageUrlEnum of string  
  //#endregion

  type PinMediaSourceImageURL = {
    SourceType : SourceTypeEnum;
    Url : string;
  }
  //#endregion
