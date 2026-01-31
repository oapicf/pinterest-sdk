namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ContentType

module PinMediaSourceImagesBase64Item =

  //#region PinMediaSourceImagesBase64Item


  type PinMediaSourceImagesBase64Item = {
    ContentType : ContentType;
    Data : string;
    Description : string;
    Link : string;
    Title : string;
  }
  //#endregion
