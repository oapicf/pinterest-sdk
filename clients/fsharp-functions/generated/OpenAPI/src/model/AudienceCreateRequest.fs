namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AudienceRule
open OpenAPI.Model.AudienceType

module AudienceCreateRequest =

  //#region AudienceCreateRequest

  [<CLIMutable>]
  type AudienceCreateRequest = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "rule")>]
    Rule : AudienceRule;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "audience_type")>]
    AudienceType : AudienceType;
  }

  //#endregion
