namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Exception
open OpenAPI.Model.UserListOperationType

module CustomerListUpdateRequest =

  //#region CustomerListUpdateRequest


  type CustomerListUpdateRequest = {
    Records : string;
    OperationType : UserListOperationType;
    Exceptions : Exception;
  }
  //#endregion
