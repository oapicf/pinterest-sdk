namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MediaUploadStatus
open OpenAPI.Model.MediaUploadType

module MediaUploadDetails =

  //#region MediaUploadDetails


  type MediaUploadDetails = {
    MediaId : string;
    MediaType : MediaUploadType;
    Status : MediaUploadStatus;
  }
  //#endregion
