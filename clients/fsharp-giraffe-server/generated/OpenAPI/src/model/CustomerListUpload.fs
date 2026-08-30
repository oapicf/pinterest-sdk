namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ErrorDetail
open OpenAPI.Model.RecordCounts
open OpenAPI.Model.UserListOperationType
open OpenAPI.Model.WorkloadState

module CustomerListUpload =

  //#region CustomerListUpload


  type CustomerListUpload = {
    AdAccountId : string;
    CreationTime : int;
    CustomerListId : string;
    ErrorCounts : ErrorDetail[];
    Id : string;
    Operation : UserListOperationType;
    RecordCounts : RecordCounts;
    State : WorkloadState;
    UpdatedTime : int;
  }
  //#endregion
