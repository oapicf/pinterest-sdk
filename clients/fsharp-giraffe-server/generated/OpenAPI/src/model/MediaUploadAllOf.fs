namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MediaUploadAllOfUploadParameters
open OpenAPI.Model.MediaUploadType

module MediaUploadAllOf =

  //#region MediaUploadAllOf


  type MediaUpload_allOf = {
    MediaId : string;
    MediaType : MediaUploadType;
    UploadUrl : string;
    UploadParameters : MediaUploadAllOfUploadParameters;
  }
  //#endregion
