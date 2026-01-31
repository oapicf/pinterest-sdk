namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ErrorDetail
open OpenAPI.Model.RecordCounts
open OpenAPI.Model.UserListOperationType

module CustomerListUpload =

  //#region CustomerListUpload

  //#region enums
  type StateEnum = NOTSTARTEDEnum of string  |  RUNNINGEnum of string  |  PAUSEDEnum of string  |  SUCCEEDEDEnum of string  |  FAILEDEnum of string  
  //#endregion

  type CustomerListUpload = {
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
