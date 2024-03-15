namespace OpenAPI.Model

open System
open System.Collections.Generic

module CustomerList =

  //#region CustomerList

  //#region enums
  type StatusEnum = PROCESSINGEnum of string  |  READYEnum of string  |  TOOSMALLEnum of string  |  UPLOADINGEnum of string  
  //#endregion

  type CustomerList = {
    AdAccountId : string;
    CreatedTime : decimal;
    Id : string;
    Name : string;
    NumBatches : decimal;
    NumRemovedUserRecords : decimal;
    NumUploadedUserRecords : decimal;
    Status : StatusEnum;
    Type : string;
    UpdatedTime : decimal;
    Exceptions : obj;
  }
  //#endregion
