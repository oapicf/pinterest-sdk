namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdAccountsAudienceRule
open OpenAPI.Model.AudienceType
open OpenAPI.Model.string option

module AdAccountsAudienceCreate =

  //#region AdAccountsAudienceCreate

  [<CLIMutable>]
  type AdAccountsAudienceCreate = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "audience_type")>]
    AudienceType : AudienceType;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "rule")>]
    Rule : AdAccountsAudienceRule;
  }

  //#endregion
