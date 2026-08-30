namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdAccountsAudienceRule
open OpenAPI.Model.AudienceType
open OpenAPI.Model.string option

module AdAccountsAudienceCreate =

  //#region AdAccountsAudienceCreate


  type AdAccountsAudienceCreate = {
    AdAccountId : string;
    AudienceType : AudienceType;
    Description : string option;
    Name : string;
    Rule : AdAccountsAudienceRule;
  }
  //#endregion
