namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AudienceRule
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module Audience =

  //#region Audience

  [<CLIMutable>]
  type Audience = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "audience_type")>]
    AudienceType : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "rule")>]
    Rule : AudienceRule;
    [<JsonProperty(PropertyName = "size")>]
    Size : int option;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "created_timestamp")>]
    CreatedTimestamp : int option;
    [<JsonProperty(PropertyName = "updated_timestamp")>]
    UpdatedTimestamp : int option;
  }

  //#endregion
