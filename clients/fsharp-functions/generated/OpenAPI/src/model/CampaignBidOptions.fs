namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AgeBucketMultipliers
open OpenAPI.Model.AppTypeMultipliers
open OpenAPI.Model.CampaignAudienceMultipliers
open OpenAPI.Model.FreqBidMultiplierTimeWindow
open OpenAPI.Model.FrequencyMultipliers
open OpenAPI.Model.GenderMultipliers
open OpenAPI.Model.PlacementMultipliers

module CampaignBidOptions =

  //#region CampaignBidOptions

  [<CLIMutable>]
  type CampaignBidOptions = {
    [<JsonProperty(PropertyName = "age_bucket_multipliers")>]
    AgeBucketMultipliers : AgeBucketMultipliers;
    [<JsonProperty(PropertyName = "app_type_multipliers")>]
    AppTypeMultipliers : AppTypeMultipliers;
    [<JsonProperty(PropertyName = "audience_multipliers")>]
    AudienceMultipliers : CampaignAudienceMultipliers;
    [<JsonProperty(PropertyName = "freq_bid_multiplier_time_window")>]
    FreqBidMultiplierTimeWindow : FreqBidMultiplierTimeWindow;
    [<JsonProperty(PropertyName = "frequency_multipliers")>]
    FrequencyMultipliers : FrequencyMultipliers;
    [<JsonProperty(PropertyName = "gender_multipliers")>]
    GenderMultipliers : GenderMultipliers;
    [<JsonProperty(PropertyName = "placement_multipliers")>]
    PlacementMultipliers : PlacementMultipliers;
  }

  //#endregion
