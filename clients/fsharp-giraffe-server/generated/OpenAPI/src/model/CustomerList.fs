namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CustomerListStatus

module CustomerList =

  //#region CustomerList


  type CustomerList = {
    AdAccountId : string;
    CreatedTime : decimal;
    Exceptions : obj;
    Id : string;
    IsNca : bool;
    Name : string;
    NumBatches : decimal;
    NumRemovedUserRecords : decimal;
    NumUploadedUserRecords : decimal;
    Status : CustomerListStatus;
    Type : string;
    UpdatedTime : decimal;
  }
  //#endregion
