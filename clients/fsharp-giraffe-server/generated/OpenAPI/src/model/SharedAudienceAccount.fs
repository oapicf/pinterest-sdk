namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AudienceAccountType

module SharedAudienceAccount =

  //#region SharedAudienceAccount


  type SharedAudienceAccount = {
    AccountId : string;
    AccountName : string;
    AccountType : AudienceAccountType;
    SharedOnTimestamp : int;
  }
  //#endregion
