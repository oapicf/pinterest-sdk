namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ErrorDetail
open OpenAPI.Model.RecordCounts
open OpenAPI.Model.UserListOperationType

module CustomerListUploadResponse =

  //#region CustomerListUploadResponse

  //#region enums
  type StateEnum = NOTSTARTEDEnum of string  |  RUNNINGEnum of string  |  PAUSEDEnum of string  |  SUCCEEDEDEnum of string  |  FAILEDEnum of string  
  //#endregion

  type CustomerListUploadResponse = {
    AdAccountId : string;
    CreationTime : int;
    CustomerListId : string;
    ErrorCounts : ErrorDetail[];
    Id : string;
    Operation : UserListOperationType;
    RecordCounts : RecordCounts;
    State : StateEnum;
    UpdatedTime : int;
  }
  //#endregion
