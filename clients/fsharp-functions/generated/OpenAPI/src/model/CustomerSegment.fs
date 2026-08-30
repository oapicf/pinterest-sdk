namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TargetingTemplateStatus

module CustomerSegment =

  //#region CustomerSegment

  [<CLIMutable>]
  type CustomerSegment = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "audience_ids")>]
    AudienceIds : string[];
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : int;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : TargetingTemplateStatus;
    [<JsonProperty(PropertyName = "updated_time")>]
    UpdatedTime : int;
  }

  //#endregion
