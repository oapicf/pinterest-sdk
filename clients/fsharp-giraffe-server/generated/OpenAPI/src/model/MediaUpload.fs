namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MediaUploadAllOf
open OpenAPI.Model.MediaUploadAllOfUploadParameters
open OpenAPI.Model.MediaUploadType

module MediaUpload =

  //#region MediaUpload


  type MediaUpload = {
    MediaId : string;
    MediaType : MediaUploadType;
    UploadUrl : string;
    UploadParameters : MediaUploadAllOfUploadParameters;
  }
  //#endregion
