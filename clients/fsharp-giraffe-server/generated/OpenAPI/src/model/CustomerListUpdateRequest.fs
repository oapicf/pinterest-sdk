namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.UserListOperationType

module CustomerListUpdateRequest =

  //#region CustomerListUpdateRequest


  type CustomerListUpdateRequest = {
    OperationType : UserListOperationType;
    Records : string;
  }
  //#endregion
