namespace OpenAPI.Model

open System
open System.Collections.Generic

module BrandAccountProfileImage =

  //#region BrandAccountProfileImage

  //#region enums
  type ContentTypeEnum = ImageJpegEnum of string  |  ImagePngEnum of string  
  //#endregion

  type BrandAccountProfileImage = {
    ContentType : ContentTypeEnum;
    Data : string;
  }
  //#endregion
