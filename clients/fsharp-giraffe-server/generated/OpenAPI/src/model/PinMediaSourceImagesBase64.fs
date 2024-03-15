namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PinMediaSourceImagesBase64ItemsInner

module PinMediaSourceImagesBase64 =

  //#region PinMediaSourceImagesBase64

  //#region enums
  type SourceTypeEnum = MultipleImageBase64Enum of string  
  //#endregion

  type PinMediaSourceImagesBase64 = {
    SourceType : SourceTypeEnum;
    Items : PinMediaSourceImagesBase64ItemsInner[];
    Index : int;
  }
  //#endregion
