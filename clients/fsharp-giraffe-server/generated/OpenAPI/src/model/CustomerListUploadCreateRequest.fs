namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.UserListOperationType

module CustomerListUploadCreateRequest =

  //#region CustomerListUploadCreateRequest


  type CustomerListUploadCreateRequest = {
    Operation : UserListOperationType;
    TotalParts : int;
  }
  //#endregion
