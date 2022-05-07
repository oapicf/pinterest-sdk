namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ActionType

module AdGroupResponseAllOf1 =

  //#region AdGroupResponseAllOf1

  [<CLIMutable>]
  type AdGroupResponseAllOf1 = {
    [<JsonProperty(PropertyName = "campaign_id")>]
    CampaignId : string;
    [<JsonProperty(PropertyName = "billable_event")>]
    BillableEvent : ActionType;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : int;
    [<JsonProperty(PropertyName = "updated_time")>]
    UpdatedTime : int;
  }

  //#endregion
