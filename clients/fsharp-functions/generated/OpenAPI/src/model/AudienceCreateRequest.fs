namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AudienceCreateRequest1AudienceType
open OpenAPI.Model.AudienceRule

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
    AudienceType : AudienceCreateRequest1AudienceType;
  }

  //#endregion
