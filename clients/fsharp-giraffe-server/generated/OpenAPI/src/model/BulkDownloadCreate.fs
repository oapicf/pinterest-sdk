namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BulkDownloadCampaignFilter
open OpenAPI.Model.BulkEntityType
open OpenAPI.Model.BulkOutputFormat

module BulkDownloadCreate =

  //#region BulkDownloadCreate


  type BulkDownloadCreate = {
    CampaignFilter : BulkDownloadCampaignFilter;
    EntityIds : string[];
    EntityTypes : BulkEntityType[];
    OutputFormat : BulkOutputFormat;
    UpdatedSince : string;
  }
  //#endregion
