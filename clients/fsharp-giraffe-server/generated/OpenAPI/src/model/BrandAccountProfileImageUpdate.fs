namespace OpenAPI.Model

open System
open System.Collections.Generic

module BrandAccountProfileImageUpdate =

  //#region BrandAccountProfileImageUpdate

  //#region enums
  type ContentTypeEnum = ImageJpegEnum of string  |  ImagePngEnum of string  
  //#endregion

  type BrandAccountProfileImageUpdate = {
    ContentType : ContentTypeEnum;
    Data : string;
  }
  //#endregion
