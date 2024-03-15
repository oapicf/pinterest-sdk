namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BulkDownloadRequestCampaignFilter
open OpenAPI.Model.BulkEntityType
open OpenAPI.Model.BulkOutputFormat

module BulkDownloadRequest =

  //#region BulkDownloadRequest


  type BulkDownloadRequest = {
    EntityTypes : BulkEntityType[];
    EntityIds : string[];
    UpdatedSince : string;
    CampaignFilter : BulkDownloadRequestCampaignFilter;
    OutputFormat : BulkOutputFormat;
  }
  //#endregion
