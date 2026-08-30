namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdAccountsAudienceRule
open OpenAPI.Model.AudienceType
open OpenAPI.Model.AudienceUpdateOperationType
open OpenAPI.Model.string option

module AdAccountsAudienceUpdate =

  //#region AdAccountsAudienceUpdate

  [<CLIMutable>]
  type AdAccountsAudienceUpdate = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "audience_type")>]
    AudienceType : AudienceType;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "operation_type")>]
    OperationType : AudienceUpdateOperationType;
    [<JsonProperty(PropertyName = "rule")>]
    Rule : AdAccountsAudienceRule;
  }

  //#endregion
