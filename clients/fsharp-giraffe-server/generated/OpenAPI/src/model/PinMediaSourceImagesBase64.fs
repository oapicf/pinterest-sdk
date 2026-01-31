namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PinMediaSourceImagesBase64Item

module PinMediaSourceImagesBase64 =

  //#region PinMediaSourceImagesBase64

  //#region enums
  type SourceTypeEnum = MultipleImageBase64Enum of string  
  //#endregion

  type PinMediaSourceImagesBase64 = {
    Index : int;
    Items : PinMediaSourceImagesBase64Item[];
    SourceType : SourceTypeEnum;
  }
  //#endregion
