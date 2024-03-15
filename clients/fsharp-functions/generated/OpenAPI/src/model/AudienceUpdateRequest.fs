namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AudienceRule
open OpenAPI.Model.AudienceUpdateOperationType

module AudienceUpdateRequest =

  //#region AudienceUpdateRequest

  [<CLIMutable>]
  type AudienceUpdateRequest = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "rule")>]
    Rule : AudienceRule;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "operation_type")>]
    OperationType : AudienceUpdateOperationType;
  }

  //#endregion
