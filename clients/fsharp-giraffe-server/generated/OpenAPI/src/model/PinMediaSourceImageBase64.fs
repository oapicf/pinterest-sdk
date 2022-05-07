namespace OpenAPI.Model

open System
open System.Collections.Generic

module PinMediaSourceImageBase64 =

  //#region PinMediaSourceImageBase64

  //#region enums
  type SourceTypeEnum = ImageBase64Enum of string  
  //#endregion
  //#region enums
  type ContentTypeEnum = JpegEnum of string  |  PngEnum of string  
  //#endregion

  type PinMediaSourceImageBase64 = {
    SourceType : SourceTypeEnum;
    ContentType : ContentTypeEnum;
    Data : string;
  }
  //#endregion
