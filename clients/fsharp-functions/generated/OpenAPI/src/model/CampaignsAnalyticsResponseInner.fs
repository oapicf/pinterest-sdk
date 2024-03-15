namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open System.Collections.Generic

module CampaignsAnalyticsResponseInner =

  //#region CampaignsAnalyticsResponseInner

  [<CLIMutable>]
  type CampaignsAnalyticsResponseInner = {
    [<JsonProperty(PropertyName = "CAMPAIGN_ID")>]
    CAMPAIGN_ID : string;
    [<JsonProperty(PropertyName = "DATE")>]
    DATE : DateTime;
  }

  //#endregion
