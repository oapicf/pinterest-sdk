namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdAccountsAudienceRule
open OpenAPI.Model.AudienceStatus
open OpenAPI.Model.AudienceType
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module AdAccountsAudience =

  //#region AdAccountsAudience


  type AdAccountsAudience = {
    AdAccountId : string;
    AudienceType : AudienceType;
    CreatedByCompanyName : string option;
    CreatedTimestamp : int option;
    Description : string option;
    Id : string;
    IsNca : bool;
    Name : string;
    Rule : AdAccountsAudienceRule;
    Size : int option;
    Status : AudienceStatus;
    Type : string;
    UpdatedTimestamp : int option;
  }
  //#endregion
