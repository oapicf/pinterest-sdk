namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConversionObjectiveType
open OpenAPI.Model.SummaryStatus

module BulkDownloadCampaignFilter =

  //#region BulkDownloadCampaignFilter

  [<CLIMutable>]
  type BulkDownloadCampaignFilter = {
    [<JsonProperty(PropertyName = "campaign_status")>]
    CampaignStatus : SummaryStatus[];
    [<JsonProperty(PropertyName = "end_time")>]
    EndTime : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "objective_type")>]
    ObjectiveType : ConversionObjectiveType[];
    [<JsonProperty(PropertyName = "start_time")>]
    StartTime : string;
  }

  //#endregion
