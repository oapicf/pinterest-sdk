namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AudienceRule
open OpenAPI.Model.AudienceStatus
open OpenAPI.Model.PinnerListType
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module Audience =

  //#region Audience

  [<CLIMutable>]
  type Audience = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "audience_type")>]
    AudienceType : PinnerListType;
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
    Rule : AudienceRule;
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
