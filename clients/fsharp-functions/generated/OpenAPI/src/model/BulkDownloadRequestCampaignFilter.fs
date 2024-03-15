namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CampaignSummaryStatus
open OpenAPI.Model.ObjectiveType

module BulkDownloadRequestCampaignFilter =

  //#region BulkDownloadRequestCampaignFilter

  [<CLIMutable>]
  type BulkDownloadRequestCampaignFilter = {
    [<JsonProperty(PropertyName = "start_time")>]
    StartTime : string;
    [<JsonProperty(PropertyName = "end_time")>]
    EndTime : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "campaign_status")>]
    CampaignStatus : CampaignSummaryStatus[];
    [<JsonProperty(PropertyName = "objective_type")>]
    ObjectiveType : ObjectiveType[];
  }

  //#endregion
