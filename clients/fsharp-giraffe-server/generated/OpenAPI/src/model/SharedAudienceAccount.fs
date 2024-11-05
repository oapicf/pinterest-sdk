namespace OpenAPI.Model

open System
open System.Collections.Generic

module SharedAudienceAccount =

  //#region SharedAudienceAccount

  //#region enums
  type AccountTypeEnum = ADACCOUNTEnum of string  |  BUSINESSACCOUNTEnum of string  
  //#endregion

  type SharedAudienceAccount = {
    AccountId : string;
    AccountName : string;
    AccountType : AccountTypeEnum;
    SharedOnTimestamp : int;
  }
  //#endregion
