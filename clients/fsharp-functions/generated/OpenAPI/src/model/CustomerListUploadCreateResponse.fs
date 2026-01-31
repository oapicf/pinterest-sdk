namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CustomerListUpload
open OpenAPI.Model.S3MultipartUploadData

module CustomerListUploadCreateResponse =

  //#region CustomerListUploadCreateResponse

  [<CLIMutable>]
  type CustomerListUploadCreateResponse = {
    [<JsonProperty(PropertyName = "customer_list_upload")>]
    CustomerListUpload : CustomerListUpload;
    [<JsonProperty(PropertyName = "s3_multipart_upload_data")>]
    S3MultipartUploadData : S3MultipartUploadData;
  }

  //#endregion
