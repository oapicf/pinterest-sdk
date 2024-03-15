namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PinMediaSourceImagesURLItemsInner

module PinMediaSourceImagesURL =

  //#region PinMediaSourceImagesURL

  //#region enums
  type SourceTypeEnum = MultipleImageUrlsEnum of string  
  //#endregion

  type PinMediaSourceImagesURL = {
    SourceType : SourceTypeEnum;
    Items : PinMediaSourceImagesURLItemsInner[];
    Index : int;
  }
  //#endregion
