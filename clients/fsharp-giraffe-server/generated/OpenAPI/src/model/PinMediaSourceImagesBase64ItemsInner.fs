namespace OpenAPI.Model

open System
open System.Collections.Generic

module PinMediaSourceImagesBase64ItemsInner =

  //#region PinMediaSourceImagesBase64ItemsInner

  //#region enums
  type ContentTypeEnum = JpegEnum of string  |  PngEnum of string  
  //#endregion

  type PinMediaSourceImagesBase64_items_inner = {
    Title : string;
    Description : string;
    Link : string;
    ContentType : ContentTypeEnum;
    Data : string;
  }
  //#endregion
