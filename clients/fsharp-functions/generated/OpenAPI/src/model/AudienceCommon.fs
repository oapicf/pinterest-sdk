namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AudienceRule

module AudienceCommon =

  //#region AudienceCommon

  [<CLIMutable>]
  type AudienceCommon = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "rule")>]
    Rule : AudienceRule;
  }

  //#endregion
