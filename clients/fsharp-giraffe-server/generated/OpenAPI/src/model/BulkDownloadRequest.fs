namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BulkDownloadRequestCampaignFilter
open OpenAPI.Model.BulkEntityType
open OpenAPI.Model.BulkOutputFormat

module BulkDownloadRequest =

  //#region BulkDownloadRequest


  type BulkDownloadRequest = {
    CampaignFilter : BulkDownloadRequestCampaignFilter;
    EntityIds : string[];
    EntityTypes : BulkEntityType[];
    OutputFormat : BulkOutputFormat;
    UpdatedSince : string;
  }
  //#endregion
