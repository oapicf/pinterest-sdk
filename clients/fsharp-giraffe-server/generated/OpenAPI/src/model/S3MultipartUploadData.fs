namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.S3FilePart

module S3MultipartUploadData =

  //#region S3MultipartUploadData


  type S3MultipartUploadData = {
    FileParts : S3FilePart[];
  }
  //#endregion
