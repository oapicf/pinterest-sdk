namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ContentType

module PinMediaSourceImageBase64 =

  //#region PinMediaSourceImageBase64

  //#region enums
  type SourceTypeEnum = ImageBase64Enum of string  
  //#endregion

  type PinMediaSourceImageBase64 = {
    ContentType : ContentType;
    Data : string;
    IsStandard : bool;
    SourceType : SourceTypeEnum;
  }
  //#endregion
