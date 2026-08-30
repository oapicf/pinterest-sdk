namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdAccountsAudienceRule
open OpenAPI.Model.AudienceStatus
open OpenAPI.Model.AudienceType
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module AdAccountsAudience =

  //#region AdAccountsAudience

  [<CLIMutable>]
  type AdAccountsAudience = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "audience_type")>]
    AudienceType : AudienceType;
    [<JsonProperty(PropertyName = "created_by_company_name")>]
    CreatedByCompanyName : string option;
    [<JsonProperty(PropertyName = "created_timestamp")>]
    CreatedTimestamp : int option;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "is_nca")>]
    IsNca : bool;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "rule")>]
    Rule : AdAccountsAudienceRule;
    [<JsonProperty(PropertyName = "size")>]
    Size : int option;
    [<JsonProperty(PropertyName = "status")>]
    Status : AudienceStatus;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "updated_timestamp")>]
    UpdatedTimestamp : int option;
  }

  //#endregion
