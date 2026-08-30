namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CampaignsAnalyticsMetrics =

  //#region CampaignsAnalyticsMetrics

  [<CLIMutable>]
  type CampaignsAnalyticsMetrics = {
    [<JsonProperty(PropertyName = "CAMPAIGN_ID")>]
    CAMPAIGN_ID : string;
    [<JsonProperty(PropertyName = "DATE")>]
    DATE : DateTime;
  }

  //#endregion
