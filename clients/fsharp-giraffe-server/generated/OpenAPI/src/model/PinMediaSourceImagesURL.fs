namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PinMediaSourceImagesURLItem

module PinMediaSourceImagesURL =

  //#region PinMediaSourceImagesURL

  //#region enums
  type SourceTypeEnum = MultipleImageUrlsEnum of string  
  //#endregion

  type PinMediaSourceImagesURL = {
    Index : int;
    Items : PinMediaSourceImagesURLItem[];
    SourceType : SourceTypeEnum;
  }
  //#endregion
