namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CustomerListRecordRow
open OpenAPI.Model.UserListOperationType

module CustomerListUpdateWithRequiredBody =

  //#region CustomerListUpdateWithRequiredBody


  type CustomerListUpdateWithRequiredBody = {
    OperationType : UserListOperationType;
    Records : string;
    RecordsV2 : CustomerListRecordRow[];
  }
  //#endregion
