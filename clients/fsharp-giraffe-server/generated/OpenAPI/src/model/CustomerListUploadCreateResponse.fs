namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CustomerListUpload
open OpenAPI.Model.S3MultipartUploadData

module CustomerListUploadCreateResponse =

  //#region CustomerListUploadCreateResponse


  type CustomerListUploadCreateResponse = {
    CustomerListUpload : CustomerListUpload;
    S3MultipartUploadData : S3MultipartUploadData;
  }
  //#endregion
