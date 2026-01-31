namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MediaUploadStatus
open OpenAPI.Model.MediaUploadType

module Media =

  //#region Media


  type Media = {
    MediaId : string;
    MediaType : MediaUploadType;
    Status : MediaUploadStatus;
  }
  //#endregion
