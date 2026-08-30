namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConversionObjectiveType
open OpenAPI.Model.SummaryStatus

module BulkDownloadCampaignFilter =

  //#region BulkDownloadCampaignFilter


  type BulkDownloadCampaignFilter = {
    CampaignStatus : SummaryStatus[];
    EndTime : string;
    Name : string;
    ObjectiveType : ConversionObjectiveType[];
    StartTime : string;
  }
  //#endregion
