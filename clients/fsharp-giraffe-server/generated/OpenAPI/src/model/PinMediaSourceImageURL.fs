namespace OpenAPI.Model

open System
open System.Collections.Generic

module PinMediaSourceImageURL =

  //#region PinMediaSourceImageURL

  //#region enums
  type SourceTypeEnum = ImageUrlEnum of string  
  //#endregion

  type PinMediaSourceImageURL = {
    IsStandard : bool;
    SourceType : SourceTypeEnum;
    Url : string;
  }
  //#endregion
