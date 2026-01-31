namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CampaignSummaryStatus
open OpenAPI.Model.ObjectiveType

module BulkDownloadRequestCampaignFilter =

  //#region BulkDownloadRequestCampaignFilter


  type BulkDownloadRequest_campaign_filter = {
    CampaignStatus : CampaignSummaryStatus[];
    EndTime : string;
    Name : string;
    ObjectiveType : ObjectiveType[];
    StartTime : string;
  }
  //#endregion
