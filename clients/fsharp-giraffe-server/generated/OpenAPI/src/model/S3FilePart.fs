namespace OpenAPI.Model

open System
open System.Collections.Generic

module S3FilePart =

  //#region S3FilePart


  type S3FilePart = {
    PartNumber : int;
    PresignedUrl : string;
  }
  //#endregion
