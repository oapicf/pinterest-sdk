namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdAccountsAudienceRule
open OpenAPI.Model.AudienceType
open OpenAPI.Model.AudienceUpdateOperationType
open OpenAPI.Model.string option

module AdAccountsAudienceUpdate =

  //#region AdAccountsAudienceUpdate


  type AdAccountsAudienceUpdate = {
    AdAccountId : string;
    AudienceType : AudienceType;
    Description : string option;
    Name : string;
    OperationType : AudienceUpdateOperationType;
    Rule : AdAccountsAudienceRule;
  }
  //#endregion
