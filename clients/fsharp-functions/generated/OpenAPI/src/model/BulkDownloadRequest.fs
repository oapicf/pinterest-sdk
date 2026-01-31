namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BulkDownloadRequestCampaignFilter
open OpenAPI.Model.BulkEntityType
open OpenAPI.Model.BulkOutputFormat

module BulkDownloadRequest =

  //#region BulkDownloadRequest

  [<CLIMutable>]
  type BulkDownloadRequest = {
    [<JsonProperty(PropertyName = "campaign_filter")>]
    CampaignFilter : BulkDownloadRequestCampaignFilter;
    [<JsonProperty(PropertyName = "entity_ids")>]
    EntityIds : string[];
    [<JsonProperty(PropertyName = "entity_types")>]
    EntityTypes : BulkEntityType[];
    [<JsonProperty(PropertyName = "output_format")>]
    OutputFormat : BulkOutputFormat;
    [<JsonProperty(PropertyName = "updated_since")>]
    UpdatedSince : string;
  }

  //#endregion
