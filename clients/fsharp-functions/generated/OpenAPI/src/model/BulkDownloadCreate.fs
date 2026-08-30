namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BulkDownloadCampaignFilter
open OpenAPI.Model.BulkEntityType
open OpenAPI.Model.BulkOutputFormat

module BulkDownloadCreate =

  //#region BulkDownloadCreate

  [<CLIMutable>]
  type BulkDownloadCreate = {
    [<JsonProperty(PropertyName = "campaign_filter")>]
    CampaignFilter : BulkDownloadCampaignFilter;
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
