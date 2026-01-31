namespace OpenAPI.Model

open System
open System.Collections.Generic

module ImageBase64 =

  //#region ImageBase64

  //#region enums
  type ContentTypeEnum = ImageJpegEnum of string  |  ImagePngEnum of string  
  //#endregion

  type Image_Base64 = {
    ContentType : ContentTypeEnum;
    Data : string;
  }
  //#endregion
